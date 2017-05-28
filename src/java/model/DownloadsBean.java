/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lwando
 * 
 */
import java.sql.Blob;
 
public class DownloadsBean {
    private String fileID;
    private String studentNumber;
    private String fileName;
    private String fileExtension;
    private Blob blob;

    public DownloadsBean() {
    }

    public DownloadsBean(String fileID, String studentNumber, String fileName, String fileExtension, Blob blob) {
        this.fileID = fileID;
        this.studentNumber = studentNumber;
        this.fileName = fileName;
        this.fileExtension = fileExtension;
        this.blob = blob;
    }

    public String getFileID() {
        return fileID;
    }

    public void setFileID(String fileID) {
        this.fileID = fileID;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public Blob getBlob() {
        return blob;
    }

    public void setBlob(Blob blob) {
        this.blob = blob;
    }
      
}
