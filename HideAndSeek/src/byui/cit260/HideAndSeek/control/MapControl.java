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

//        megsPark,
//        northStation,
//        westernStation,
//        centralPark,
//        printShop,
//        movieTheater,
//        cadenasHome,
//        griffinsHome,
//        smithsHome,
//        mayorsOffice,
//        waterworksPark,
//        hydesHome,
//        electronicStore,
//        library,
//        centralStation,
//        mayorJohnsonsHome,
//        easternStation,
//        southStation,
//        joelsPark,
//        doctorsClinic,
//        trainStation,
//        antoniosPark;  
        return scenes;
    }

}
