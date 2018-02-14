/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign3.josephantonacci;

/**
 *
 * @author Joe Antonacci
 */
public abstract class MyHome {
    String description = "My Home";
    
    public String getDescription() {
        return description;
    }
    public abstract double cost();
    
    public abstract double area();
    
}
