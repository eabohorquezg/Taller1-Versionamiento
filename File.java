/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class File {
    private String fileType;
    private Byte[] content;
    private double size;

    public File(String fileType, Byte[] content, double size) {
        this.fileType = fileType;
        this.content = content;
        this.size = size;
    }

    public String getFileType() {
        return fileType;
    }

    public Byte[] getContent() {
        return content;
    }

    public double getSize() {
        return size;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }

    public void setSize(double size) {
        this.size = size;
    }
    
    
    public void download() {
        
    }
    
    public void share() {
        
    }
    
}
