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
public class GuitarHero{
    
    public static void main(String[] args) {
        GameCharacter player1 = new GameCharacterNirvana();
        player1.display();
        player1.playGuitar();
        player1.playSolo();
        player1.setSoloMove(new BreakGuitar());
        player1.playSolo();
        player1.leaveStage();
        GameCharacter player2 = new GameCharacterBrianMay();
        player2.display();
        player2.playGuitar();
        player2.playSolo();
        player2.setSoloMove(new DanceAndPlay());
        player2.setGuitar(new GibsonFlying());
        player2.playGuitar();
        player2.playSolo();
        player2.leaveStage();
        GameCharacter player3 = new GameCharacterJimiHendrix();
        player3.display();
        player3.playGuitar();
        player3.playSolo();
        player3.setGuitar(new FenderJaguar());
        player3.playGuitar();
        player3.leaveStage();
        
    	}
}