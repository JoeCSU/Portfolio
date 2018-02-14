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
public class Bedroom extends HomeComponent {
    MyHome myHome;
    
    public Bedroom(MyHome myHome) {
        this.myHome = myHome;
    }
    
    public String getDescription() {
        return myHome.getDescription() + ", Bedroom";
    }   

    public double cost() {
        return 15250.00 + myHome.cost();
    }
    
    public double area() {
        return 362.00 + myHome.area();
    }
}