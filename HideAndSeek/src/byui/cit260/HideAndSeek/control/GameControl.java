package byui.cit260.HideAndSeek.control;

import byui.cit260.HideAndSeek.model.Game;
import byui.cit260.HideAndSeek.model.Inventory;
import byui.cit260.HideAndSeek.model.Map;
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

    public static void createNewGame(Player player) {
        
        Game game = new Game();  //create new game
        HideAndSeek.setCurrentGame(game); // save in HideAndSeek
        
        game.setPlayer(player); //save player in game
        
        //create inventory list and save in the game
        Inventory[] inventory = GameControl.createInventory();
        game.setInventory(inventory);
        
        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // saves map in game
        
        // move actors to starting position in the map
        MapControl.moveActorToStartingLocation(map);
    }

    public static Inventory[] createInventory() {
        System.out.println("*** called createInventory() in GameControl ***");
        return null;
        
    }
    
    
}
