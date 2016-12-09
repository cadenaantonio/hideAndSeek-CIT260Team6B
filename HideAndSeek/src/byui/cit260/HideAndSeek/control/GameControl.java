package byui.cit260.HideAndSeek.control;

import byui.cit260.HideAndSeek.control.MapControl;
import byui.cit260.HideAndSeek.enu.InventoryType;
import byui.cit260.HideAndSeek.enu.SceneType;
import byui.cit260.HideAndSeek.exceptions.GameControlException;
import byui.cit260.HideAndSeek.model.Game;
import byui.cit260.HideAndSeek.model.Hero;
import byui.cit260.HideAndSeek.model.Inventory;
import byui.cit260.HideAndSeek.model.Items;
import byui.cit260.HideAndSeek.model.Location;
import byui.cit260.HideAndSeek.model.Map;
import byui.cit260.HideAndSeek.model.Player;
import byui.cit260.HideAndSeek.model.Scene;
import byui.cit260.HideAndSeek.model.Weapon;
import hideandseek.HideAndSeek;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

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
        Inventory[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);

        Map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // saves map in game

        // move actors to starting position in the map
        MapControl.moveActorToStartingLocation(map);
        MapControl.movePlayerToStartingLocation(map);
    }

    public static Inventory[] createInventoryList() {

        // Created array(list) of inventory items
        Inventory[] inventory = new Inventory[9];

        Inventory abilityPotion = new Inventory();
        abilityPotion.setNameB(InventoryType.abilityPotion.nameB());
        abilityPotion.setDescription(InventoryType.abilityPotion.description());
        abilityPotion.setItemCount(InventoryType.abilityPotion.itemCount());
        abilityPotion.setType(InventoryType.abilityPotion.type());
        inventory[InventoryType.abilityPotion.ordinal()] = abilityPotion;

        Inventory abilityElixer = new Inventory();
        abilityElixer.setNameB(InventoryType.abilityElixer.nameB());
        abilityElixer.setDescription(InventoryType.abilityElixer.description());
        abilityElixer.setItemCount(InventoryType.abilityElixer.itemCount());
        abilityElixer.setType(InventoryType.abilityElixer.type());
        inventory[InventoryType.abilityElixer.ordinal()] = abilityElixer;

        Inventory knife = new Inventory();
        knife.setNameB(InventoryType.knife.nameB());
        knife.setDescription(InventoryType.knife.description());
        knife.setItemCount(InventoryType.knife.itemCount());
        knife.setType(InventoryType.knife.type());
        inventory[InventoryType.knife.ordinal()] = knife;

        Inventory iceGun = new Inventory();
        iceGun.setNameB(InventoryType.iceGun.nameB());
        iceGun.setDescription(InventoryType.iceGun.description());
        iceGun.setItemCount(InventoryType.iceGun.itemCount());
        iceGun.setType(InventoryType.iceGun.type());
        inventory[InventoryType.iceGun.ordinal()] = iceGun;


        Inventory handcuff = new Inventory();
        handcuff.setNameB(InventoryType.handcuff.nameB());
        handcuff.setDescription(InventoryType.handcuff.description());
        handcuff.setItemCount(InventoryType.handcuff.itemCount());
        handcuff.setType(InventoryType.handcuff.type());
        inventory[InventoryType.handcuff.ordinal()] = handcuff;

        Inventory sonar = new Inventory();
        sonar.setNameB(InventoryType.sonar.nameB());
        sonar.setDescription(InventoryType.sonar.description());
        sonar.setItemCount(InventoryType.sonar.itemCount());
        sonar.setType(InventoryType.sonar.type());
        inventory[InventoryType.sonar.ordinal()] = sonar;

        Inventory superSense = new Inventory();
        superSense.setNameB(InventoryType.superSense.nameB());
        superSense.setDescription(InventoryType.superSense.description());
        superSense.setItemCount(InventoryType.superSense.itemCount());
        superSense.setType(InventoryType.superSense.type());
        inventory[InventoryType.superSense.ordinal()] = superSense;

        Inventory megaMind = new Inventory();
        megaMind.setNameB(InventoryType.megaMind.nameB());
        megaMind.setDescription(InventoryType.megaMind.description());
        megaMind.setItemCount(InventoryType.megaMind.itemCount());
        megaMind.setType(InventoryType.megaMind.type());
        inventory[InventoryType.megaMind.ordinal()] = megaMind;

        Inventory flight = new Inventory();
        flight.setNameB(InventoryType.flight.nameB());
        flight.setDescription(InventoryType.flight.description());
        flight.setItemCount(InventoryType.flight.itemCount());
        flight.setType(InventoryType.flight.type());
        inventory[InventoryType.flight.ordinal()] = flight;

        return inventory;
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();

// row 1
        locations[0][0].setScene(scenes[SceneType.smithsMarketplace.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.andersonHome.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.hospital.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.megsPark.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.northStation.ordinal()]);

// row 2
        locations[1][0].setScene(scenes[SceneType.westernStation.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.centralPark.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.printShop.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.movieTheater.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.cadenasHome.ordinal()]);

// row 3
        locations[2][0].setScene(scenes[SceneType.griffinsHome.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.smithsHome.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.mayorsOffice.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.waterworksPark.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.hydesHome.ordinal()]);

// row 4
        locations[3][0].setScene(scenes[SceneType.electronicStore.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.library.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.centralStation.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.mayorJohnsonsHome.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.easternStation.ordinal()]);

// row 5
        locations[4][0].setScene(scenes[SceneType.southStation.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.joelsPark.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.doctorsClinic.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.trainStation.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.antoniosPark.ordinal()]);
    }

    public static void saveGame(Game game, String filepath) 
        throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game);    //write the game object out to file    }
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) 
        throws GameControlException {
        
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject(); // read the game object from file
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        
        // close the output file
        HideAndSeek.setCurrentGame(game); //save in HideAndSeek;
     
    }
}
