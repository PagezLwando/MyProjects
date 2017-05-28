/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.DAO;
import model.UploadsBean;

/**
 *
 * @author Lwando
 */
@WebServlet(name = "NewSupport", urlPatterns = {"/NewSupport"})
public class SupportDocs extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        
        String firstName = request.getParameter("firstName");
        Part idCopy= request.getPart("idCopy");
        Part endOfYearResults= request.getPart("latestResults");
        Part guardianIdCopy = request.getPart("guardianIdCopy");
        
        ArrayList<String> errorList = new ArrayList<>();
        
        if(idCopy == null || idCopy.getSize()==0) 
            errorList.add("Please select Your Identity Document Copy");
       
        if(endOfYearResults == null || endOfYearResults.getSize()==0) 
            errorList.add("Please select Your latest Results");
        
        if(guardianIdCopy == null || guardianIdCopy.getSize()==0) 
            errorList.add("Please select Your Guardian's Identity Doc Copy");
        
        
        DAO dao = new DAO();
        if(errorList.isEmpty())
        {  
            Part [] files = new Part[3];
            files[0] = idCopy;
            files[1] = endOfYearResults;
            files[2] = guardianIdCopy;
        
            for(int i=0; i<3; i++)
            {        
                String fileName = files[i].getName();
                String fileType = fileName.substring(fileName.lastIndexOf("."));
                boolean fileAllowed = fileType.equalsIgnoreCase(".pdf");

                if(!fileAllowed)
                {
                    errorList.add("File type not allowed");
                }
                
                if(errorList.isEmpty())
                {
                    InputStream fileContent = files[i].getInputStream();
                    UploadsBean upload = new UploadsBean(firstName,fileName,fileType,fileContent);
                    try {
                        dao.uploadFile(upload);
                    } 
                    catch (SQLException ex)
                    {
                        Logger.getLogger(SupportDocs.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    request.setAttribute("message", "Operation Successful");
                }
                else
                {
                    break;
                }
            }
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