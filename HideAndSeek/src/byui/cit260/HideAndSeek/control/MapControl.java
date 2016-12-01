/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.control;

import byui.cit260.HideAndSeek.enu.SceneType;
import byui.cit260.HideAndSeek.model.Actor;
import byui.cit260.HideAndSeek.model.Bomb;
import byui.cit260.HideAndSeek.model.Map;
import byui.cit260.HideAndSeek.model.Scene;

/**
 *
 * @author DragonMaster
 */
public class MapControl {

    public static Map createMap() {
        // create the map
        Map map = new Map(5, 5);

        //create the scenes for the game
        Scene[] scenes = createScenes();

        //assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);

        return map;
    }

    static void moveActorToStartingLocation(Map map) {
        System.out.println("*** called moveActorToStartingLocation()  ***");
    }

    public static void movePlayerToStartingLocation(Map map) {
        // movePlayer(map, 2, 2);
        movePlayer(map, 0, 0);
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentLocation(map.getLocations()[row][column]);
        map.getCurrentLocation().setVisited(true);

        map.setCurrentRow(row);
        map.setCurrentColumn(column);

    }

    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene currentScene = new Scene("Smith\'s Marketplace", "SM", "Smith\'s Marketplace");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.smithsMarketplace.ordinal()] = currentScene;

        currentScene = new Scene("Anderson Home", "AH", "Anderson Home");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.andersonHome.ordinal()] = currentScene;

        currentScene = new Scene("Hospital", "HS", "Hospital");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.hospital.ordinal()] = currentScene;

        currentScene = new Scene("Meg\'s Park", "MP", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.megsPark.ordinal()] = currentScene;

        currentScene = new Scene("North Station", "NS", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.northStation.ordinal()] = currentScene;

        currentScene = new Scene("Western Station", "WS", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.westernStation.ordinal()] = currentScene;

        currentScene = new Scene("Central Park", "CP", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.centralPark.ordinal()] = currentScene;

        currentScene = new Scene("Print Shop", "PS", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.printShop.ordinal()] = currentScene;

        currentScene = new Scene("Movie Theater", "MT", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.movieTheater.ordinal()] = currentScene;
//        cadenasHome,
        currentScene = new Scene("Cadena\'s Home", "CH", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.cadenasHome.ordinal()] = currentScene;

        currentScene = new Scene("Griffin\'s Home", "GH", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.griffinsHome.ordinal()] = currentScene;

        currentScene = new Scene("Smith\'s Home", "SH", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.smithsHome.ordinal()] = currentScene;

        currentScene = new Scene("Mayor\'s Office", "MO", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.mayorsOffice.ordinal()] = currentScene;

        currentScene = new Scene("Waterwork\'s Park", "WP", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.waterworksPark.ordinal()] = currentScene;

        currentScene = new Scene("Hyde\'s Home", "HH", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.hydesHome.ordinal()] = currentScene;

        currentScene = new Scene("Electronic Store", "EL", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.electronicStore.ordinal()] = currentScene;

        currentScene = new Scene("Library", "LB", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.library.ordinal()] = currentScene;

        currentScene = new Scene("Central Station", "CS", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.centralStation.ordinal()] = currentScene;

        currentScene = new Scene("Mayor Johnson\'s Home", "JH", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.mayorJohnsonsHome.ordinal()] = currentScene;

        currentScene = new Scene("Eastern Station", "ES", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.easternStation.ordinal()] = currentScene;

        currentScene = new Scene("South Station", "SS", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.southStation.ordinal()] = currentScene;

        currentScene = new Scene("Joel\'s Park", "JP", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.joelsPark.ordinal()] = currentScene;

        currentScene = new Scene("Doctor\'s Clinic", "DC", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.doctorsClinic.ordinal()] = currentScene;

        currentScene = new Scene("Train Station", "TS", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.trainStation.ordinal()] = currentScene;
  
        currentScene = new Scene("Antonio\'s Park", "AP", "");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.antoniosPark.ordinal()] = currentScene;

        return scenes;
    }

}
