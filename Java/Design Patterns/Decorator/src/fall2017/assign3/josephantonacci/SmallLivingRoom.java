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
public class SmallLivingRoom extends HomeComponent {
    MyHome myHome;
    
    public SmallLivingRoom(MyHome myHome) {
        this.myHome = myHome;
    }
    
    public String getDescription() {
        return myHome.getDescription() + ", Small LivingRoom";
    }   

    public double cost() {
        return 5500.00 + myHome.cost();
    }
    
    public double area() {
        return 200.00 + myHome.area();
    }
}
