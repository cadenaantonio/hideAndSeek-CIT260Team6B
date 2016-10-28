/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.control;

import byui.cit260.HideAndSeek.model.Player;
import hideandseek.HideAndSeek;

/**
 *
 * @author DragonMaster
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        HideAndSeek.setPlayer(player); // save the player
        
        return player;
    }
    
    
}
