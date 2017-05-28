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
import model.Applicant;
import model.DAO;

/**
 *
 * @author Lwando
 */
@WebServlet(name = "NewApplicant", urlPatterns = {"/NewApplicant"})
public class ApplicantServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException, SQLException {
        
        //Creating an ArrayList
        ArrayList<String> errorList = new ArrayList<>();
        
        //Assigning Students variables
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String title = request.getParameter("title");
        String gender = request.getParameter("gender");
        String dateOfBirth = request.getParameter("dateOfBirth");
        String identityNumber = request.getParameter("identityNumber");
        String emailAddress = request.getParameter("emailAddress");
        String cellNumber = request.getParameter("cellNumber");
        String grade = request.getParameter("grade");
        
        //Error Handling
        if(firstName==null || firstName.trim().length()==0)
            errorList.add("first Name cannot be null");
        
        if(lastName==null || lastName.trim().length()==0)
            errorList.add("Last Name can not be Null");
        
        if(title==null || title.trim().length()==0)
            errorList.add("Tick your title");
        
        if(gender==null || gender.trim().length()==0)
            errorList.add("Please Select one value");
        
        if(dateOfBirth==null || dateOfBirth.trim().length()==0)
            errorList.add("Date Of birth cannot be Null");
        
        if(identityNumber==null || identityNumber.trim().length()==0)
            errorList.add("Identity Number cannot be Null");
        
        if(emailAddress==null || emailAddress.trim().length()==0)
            errorList.add("Date Of birth cannot be Null");
        
        if(cellNumber==null || cellNumber.trim().length()==0)
            errorList.add("Cell Number cannot be Null");
        
        if(grade==null || grade.trim().length()==0)
            errorList.add("Grade cannot be Null");
        
        //Creating a Dao Object
        DAO dao = new DAO();
        Applicant m = new Applicant(firstName,lastName,title,gender,dateOfBirth,identityNumber,emailAddress,cellNumber);
            try {
                boolean s = dao.addUser(m);
                request.setAttribute("message", "Operation Successful");
                if(s==true)
                {
                    request.setAttribute("errorList", errorList); 
                    RequestDispatcher rs=request.getRequestDispatcher("../pages/guardian.jsp");
                    rs.forward(request, response);
                }
            }
            catch (SQLException ex)
            {
                errorList.add("Database Error: "+ex.getMessage());
            }
        //
        request.setAttribute("errorList", errorList); 
        RequestDispatcher rs=request.getRequestDispatcher("pages/guardian.jsp");
        rs.forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ApplicantServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ApplicantServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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