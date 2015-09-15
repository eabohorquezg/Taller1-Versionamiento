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
public class Forum {
    private String name;
    private Date dateCreated;
    private String category;
    private ArrayList<Post> agregatedPosts;

    public Forum(String name, Date dateCreated, String category) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    
    
    
}
