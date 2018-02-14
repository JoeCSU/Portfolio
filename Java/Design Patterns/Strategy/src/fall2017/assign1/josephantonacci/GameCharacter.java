/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2017.assign1.josephantonacci;

/**
 *
 * @author Joe Antonacci
 */
public abstract class GameCharacter {
    
    Guitar guitar;
    SoloMove soloMove;
    public GameCharacter() {}
        
    public abstract void display();
    
    public void playGuitar() {
        guitar.play();
    }
    public void playSolo() {
        soloMove.move();
    }
    public void leaveStage() {
        System.out.println("Character Leaves the stage...");
    }
    public void setGuitar(Guitar gu) {
        guitar = gu;    
    }
    public void setSoloMove(SoloMove so) {
        soloMove = so;
    }
}
