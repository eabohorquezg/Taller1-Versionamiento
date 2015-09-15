
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Regular extends User {
    
    private int postViews;
    private int strikeNumbers;
    private int starsNumber;
    private ArrayList<Post> posts;

    public Regular(int postViews, int strikeNumbers, int starsNumber, String name, String lastname, int age, String username, String password) {
        super(name, lastname, age, username, password);
        this.postViews = postViews;
        this.strikeNumbers = strikeNumbers;
        this.starsNumber = starsNumber;
    }

    public int getPostViews() {
        return postViews;
    }

    public int getStrikeNumbers() {
        return strikeNumbers;
    }

    public int getStarsNumber() {
        return starsNumber;
    }

    public void setPostViews(int postViews) {
        this.postViews = postViews;
    }

    public void setStrikeNumbers(int strikeNumbers) {
        this.strikeNumbers = strikeNumbers;
    }

    public void setStarsNumber(int starsNumber) {
        this.starsNumber = starsNumber;
    }
    
    
}
