import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Post {
        
    private String topic;
    private Date dateCreated;
    private Date lastUpdDate;
    private boolean isAllowed;
    private ArrayList<File> files;

    public Post(String topic, Date dateCreated, Date lastUpdDate, boolean isAllowed) {
        this.topic = topic;
        this.dateCreated = dateCreated;
        this.lastUpdDate = lastUpdDate;
        this.isAllowed = isAllowed;
    }

    public String getTopic() {
        return topic;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getLastUpdDate() {
        return lastUpdDate;
    }

    public boolean isIsAllowed() {
        return isAllowed;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setLastUpdDate(Date lastUpdDate) {
        this.lastUpdDate = lastUpdDate;
    }

    public void setIsAllowed(boolean isAllowed) {
        this.isAllowed = isAllowed;
    }
    
    //The methods specified
    
    public void comment() {
        
    }
    
    public void rate() {
        
    }
    
    public void share() {
        
    }
}
