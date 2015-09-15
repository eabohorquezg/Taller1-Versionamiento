/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Admin extends User {
    private int level;
    private double rating;

    public Admin(int level, double rating, String name, String lastname, int age, String username, String password) {
        super(name, lastname, age, username, password);
        this.level = level;
        this.rating = rating;
    }
    // Get levepl of admin user.
    public int getLevel() {
        return level;
    }

    public double getRating() {
        return rating;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
    
    
    
}
