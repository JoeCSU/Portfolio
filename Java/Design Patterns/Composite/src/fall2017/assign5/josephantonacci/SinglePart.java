/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign5.josephantonacci;

/**
 *
 * @author Joe Antonacci
 */
public class SinglePart extends CompComponent{
    
    String description;
    double price;
    
    public SinglePart(String description, double price){
        
        this.description = description;
        this.price = price;              
    }
    
    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print() {
        System.out.println(" " + getDescription() + " $" + getPrice());
    }  
}
