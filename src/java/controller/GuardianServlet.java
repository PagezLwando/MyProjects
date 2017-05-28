/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Applicant;
import model.DAO;

/**
 *
 * @author Lwando
 */
@WebServlet(name = "NewGuardian", urlPatterns = {"/NewGuardian"})
public class GuardianServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        ArrayList<String> errorList = new ArrayList<>();
        
        //Students variables
        String firstName = request.getParameter("guardiansFirstName");
        String lastName = request.getParameter("guardiansLastName");
        String title = request.getParameter("title");
        String gender = request.getParameter("gender");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String identityNumber = request.getParameter("identityNumber");
        String emailAddress = request.getParameter("emailAddress");
        String cellNumber = request.getParameter("cellNumber");
        
        
        // Uploads documents variables
        Part idCopy= request.getPart("idCopy");
        Part endOfYearResults= request.getPart("latestResults");
        Part guardianIdCopy = request.getPart("guardianIdCopy");

        if(firstName==null || firstName.trim().length()==0)
            errorList.add("first Name cannot be null");
        
        if(lastName==null || lastName.trim().length()==0)
            errorList.add("last name cant be null");
        
        if(title==null || title.trim().length()==0)
            errorList.add("Tick your title");
        
        if(gender==null || gender.trim().length()==0)
            errorList.add("Select one value");
        
        if(dateOfBirth==null || dateOfBirth.trim().length()==0)
            errorList.add("Date Of birth cannot be null");
        
        if(identityNumber==null || identityNumber.trim().length()==0)
            errorList.add("Identity Number cannot be null");
        
        if(emailAddress==null || emailAddress.trim().length()==0)
            errorList.add("Date Of birth cannot be null");
        
        if(cellNumber==null || cellNumber.trim().length()==0)
            errorList.add("Student Number cant be null");
        
        
       
        DAO dao = new DAO();
        Applicant m = new Applicant(firstName,lastName,title,gender,dateOfBirth,identityNumber,emailAddress,cellNumber);
        try {
            boolean s = dao.addUser(m);        
            request.setAttribute("message", "Operation Successful");
            if(s==true)
            {
               request.setAttribute("errorList", errorList); 
               RequestDispatcher rs=request.getRequestDispatcher("pages/supportDocs.jsp");
               rs.forward(request, response);
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(GuardianServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
