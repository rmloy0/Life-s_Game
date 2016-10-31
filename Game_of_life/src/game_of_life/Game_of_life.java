/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game_of_life;

import byui.cit260.Game_of_life.model.Player;

/**
 *
 * @author RMLOY_000
 */
public class Game_of_life { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player ();
        
        playerOne.setName("Rodrigo");
        playerOne.setBestime(8.00);
  
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);        
    }
    
}
