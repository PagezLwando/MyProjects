/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lwando
 */
package model;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    private final String driver = "org.gjt.mm.mysql.Driver";
    private final String url = "jdbc:mysql://localhost:3306/sjc_db";
    private final String username = "root";
    private final String password = "";

    public DAO() {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * Getting a connection to the database
     * @throws java.sql.SQLException
     */
    public Connection getConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }

    /**
     * Closing database resources
     */
    private void closeResources(ResultSet rs, Statement st, Connection conn) 
            throws SQLException {
        if (rs != null) {
            rs.close();
            rs = null;
        }
        if (st != null) {
            st.close();
            st = null;
        }
        if (conn != null) {
            conn.close();
            conn = null;
        }
    }

    public static void main(String[] args) throws SQLException {

            DAO dao = new DAO();
            Connection c = dao.getConnection();
            System.out.println(c.getMetaData().getDatabaseProductName());
            System.out.println(c.getMetaData().getDatabaseProductVersion());
            
        
    }

    public boolean addUser(Applicant s) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rst = null;
        String sql1 = "INSERT INTO applicant(firstName,lastName,title,gender,dateOfBirth, identityNumber"
                + "emailAddress,cellNumber,grade) VALUE(?,?,?,?,?,?,?,?,?)";

        //connection to the db
        conn = getConnection();
        ps = conn.prepareCall(sql1);
        ps.setString(1, s.getFirstName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getTitle());
        ps.setString(4, s.getGender());
        ps.setString(5, s.getDateOfBirth());
        ps.setString(6, s.getIdentityNumber());
        ps.setString(7, s.getEmailAddress());
        ps.setString(8, s.getCellNumber());
        ps.setString(9, s.getGrade());

        int status = ps.executeUpdate();
        closeResources(null, ps, conn);

        return status > 0;
    }

    public boolean uploadFile(UploadsBean upload) throws SQLException {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO supportdocuments (idCopy,latestResults,guardiansIdCopy) VALUES (?,?,?)";
        boolean isInserted = false;
        try {
            //connection to the db
            conn = getConnection();
            ps = conn.prepareStatement(sql);
            for(int i=1;i<=3;i++){
              ps.setBlob(i, upload.getFileContent());  
            }
           
            
            int status = ps.executeUpdate();
            isInserted = status > 0;
            closeResources(null, ps, conn);
        } finally {
            closeResources(null, ps, conn);
        }
        return isInserted;
    }

//    public ArrayList<DownloadsBean> getFileList(String firstName) 
//            throws SQLException {
//        Connection conn = null;
//        PreparedStatement ps = null;
//        ResultSet rst = null;
//        //to hold a list of staff from the db
//        ArrayList<DownloadsBean> fileList = new ArrayList<>();
//        //sql for listing the staff
//        String sql = "SELECT  doc_id FROM students INNER JOIN student_docs ON "
//                    + "student_number=students_student_number JOIN users ON "
//                    + "users.registration_number = students.users_registration_number"
//                     + " WHERE student_number="+firstName+" OR "
//                    + "users_registration_number="+firstName;
//        try {
//            conn = getConnection(); //connect to the database
//            ps = conn.prepareStatement(sql);
//            //execute the sql
//            rst = ps.executeQuery();
//            //check if results are there
//            while (rst.next()) {
//                DownloadsBean s = new DownloadsBean();
//                s.setFileID(rst.getString(1));
//
//                //add to the list
//                fileList.add(s);
//            }
//            //close db resources
//            closeResources(rst, ps, conn);
//        } finally {
//            //ensure that all resources are closed
//            closeResources(rst, ps, conn); //close resources
//        }
//        return fileList; //return a list of staff
//    } //end method

//public boolean deleteFile(String doc_id) throws SQLException {
//
//        Connection conn = null;
//        PreparedStatement ps = null;
//        boolean isDeleted = false;
//        String sql = "DELETE FROM supportdocuments WHERE doc_id=?";
//        try {
//            conn = getConnection(); //connection to the db
//            ps = conn.prepareStatement(sql);
//            ps.setString(1, doc_id); //set the staffno passed via parameter
//            int status = ps.executeUpdate();
//            isDeleted = status > 0;
//            closeResources(null, ps, conn); //close all db resources
//        } finally {
//            closeResources(null, ps, conn);
//        }
//        return isDeleted;
//    }
//    
}
