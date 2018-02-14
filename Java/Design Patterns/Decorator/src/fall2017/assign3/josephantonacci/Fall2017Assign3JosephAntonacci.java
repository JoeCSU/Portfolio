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
public class Fall2017Assign3JosephAntonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        MyHome myHome1 = new BasicHome1();
        System.out.println(myHome1.getDescription() + ", costs $" + myHome1.cost() +" and has "+ myHome1.area() + " total square feet");
        MyHome myHome2 = new BasicHome2();
        System.out.println(myHome2.getDescription() + ", costs $" + myHome2.cost() +" and has "+ myHome2.area() + " total square feet");
        
        MyHome myHome3 = new BasicHome1();
        myHome3 = new Kitchen(myHome3);
        myHome3 = new SmallBathroom(myHome3);
        myHome3 = new Bedroom(myHome3);
        System.out.println(myHome3.getDescription() + ", costs $" + myHome3.cost() +" and has "+ myHome3.area() + " total square feet");
        
        MyHome myHome4 = new BasicHome2();
        myHome4 = new Kitchen(myHome4);
        myHome4 = new LargeBathRoom(myHome4);
        myHome4 = new LargeBathRoom(myHome4);
        myHome4 = new Bedroom(myHome4);
        myHome4 = new Bedroom(myHome4);
        System.out.println(myHome4.getDescription() + ", costs $" + myHome4.cost() +" and has "+ myHome4.area() + " total square feet");
    }   
}
