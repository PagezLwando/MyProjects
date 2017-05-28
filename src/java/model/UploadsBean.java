/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lwando
 */
import java.io.InputStream;

public class UploadsBean {
    
    private String  firstName,
                    fileName,
                    fileType; 
                   
    private InputStream fileContent;  
    
    public UploadsBean() {
    }
    
    public UploadsBean(String firstName, String fileName, String fileType, 
                        InputStream fileContent) {
        this.firstName = firstName;
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileContent = fileContent;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
        
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public InputStream getFileContent() {
        return fileContent;
    }

    public void setFileContent(InputStream fileContent) {
        this.fileContent = fileContent;
    }    
}
