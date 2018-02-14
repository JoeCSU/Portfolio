/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign5.josephantonacci;

import java.util.*;
/**
 *
 * @author Joe Antonacci
 */
public class CompositePart extends CompComponent {

    ArrayList<CompComponent> compComponents = new ArrayList<>();
    String description;
    double price;
    
    public CompositePart(String description, double price) {
        
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
    public CompComponent getChild(int i) {
        return compComponents.get(i);
    }

    @Override
    public void remove(CompComponent compComponent) {
        compComponents.remove(compComponent);   
}

    @Override
    public void add(CompComponent compComponent) {
        compComponents.add(compComponent);
    }
    
    @Override
    public void print() {
        System.out.println(" " + getDescription() + " $" + getPrice());
        System.out.println("-------------------- ");
    
        Iterator<CompComponent> iterator = compComponents.iterator();
        while (iterator.hasNext()) {
            CompComponent compComponent = iterator.next();
            compComponent.print();
        }
    }
       
}