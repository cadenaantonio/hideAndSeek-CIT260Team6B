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
        
        // Created array(list) of inventory items
        Inventory[] inventory = new Inventory[9];
        
        Inventory potion = new Inventory();
        potion.setDescription("Ability Potion");
        potion.setItemCount(5);
        inventory[Inventory.potion.ordinal()] = potion;
        
        Inventory elixer = new Inventory();
        elixer.setDescription("Ability Elixer");
        elixer.setItemCount(2);
        inventory[Inventory.elixer.ordinal()] = elixer;
        
        Inventory knife = new Inventory();
        knife.setDescription("Knife");
        knife.setItemCount(1);
        inventory[Inventory.knife.ordinal()] = knife;
        
        Inventory gun = new Inventory();
        gun.setDescription("Ice Gun");
        gun.setItemCount(1);
        inventory[Inventory.gun.ordinal()] = gun;
        
        Inventory handcuff = new Inventory();
        handcuff.setDescription("Handcuff");
        handcuff.setItemCount(1);
        inventory[Inventory.handcuff.ordinal()] = handcuff;
        
        Inventory sonar = new Inventory();
        sonar.setDescription("Sonar");
        sonar.setItemCount(2);
        inventory[Inventory.sonar.ordinal()] = sonar;
    
        Inventory sense = new Inventory();
        sense.setDescription("Super Sense");
        sense.setItemCount(2);
        inventory[Inventory.sense.ordinal()] = sense;
    
        Inventory mind = new Inventory();
        mind.setDescription("Mega-Mind");
        mind.setItemCount(2);
        inventory[Inventory.mind.ordinal()] = mind;
    
        Inventory flight = new Inventory();
        flight.setDescription("Flight");
        flight.setItemCount(2);
        inventory[Inventory.flight.ordinal()] = flight;
        
    }
    
    
}
