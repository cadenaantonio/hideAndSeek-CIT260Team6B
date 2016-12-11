package byui.cit260.HideAndSeek.control;

import byui.cit260.HideAndSeek.enu.SceneType;
import byui.cit260.HideAndSeek.model.Actor;
import byui.cit260.HideAndSeek.model.Bomb;
import byui.cit260.HideAndSeek.model.Map;
import byui.cit260.HideAndSeek.model.Scene;
import byui.cit260.HideAndSeek.view.Story3View;

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

        Scene currentScene = new Scene("Smith\'s Marketplace", "SM", "Your average grocery store in Emerald City. Known to have great sales on Kumquats ");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.smithsMarketplace.ordinal()] = currentScene;
        
        currentScene = new Scene("Anderson Home", "AH", "The Anderson Home is a historical landmark commemorating the Anderson warriors that helped protect Emerald City during the Wicked Witch's reign.");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.andersonHome.ordinal()] = currentScene;

        currentScene = new Scene("Hospital", "HS", "The hospital, here for your medical emergencies and dramatic t.v. viewing.");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.hospital.ordinal()] = currentScene;

        currentScene = new Scene("Meg\'s Park", "MP", "A lush park known for hosting the winter festivle");
        currentScene.setActor(new Actor("Batman"));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.megsPark.ordinal()] = currentScene;

        currentScene = new Scene("North Station", "NS", "A fire station at the north end of town");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.northStation.ordinal()] = currentScene;

        currentScene = new Scene("Western Station", "WS", "A fire station at the west side of town, strangely it doesn't have a story.");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.westernStation.ordinal()] = currentScene;

        currentScene = new Scene("Central Park", "CP", " A mirror of New York City's Central Park it is known for it's carousel, however many of the animals have been switched out due to politcal correctness");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.centralPark.ordinal()] = currentScene;

        currentScene = new Scene("Print Shop", "PS", "Local print shop for all your business needs, will not print life size posters of actors.");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.printShop.ordinal()] = currentScene;

        currentScene = new Scene("Movie Theater", "MT", "Local movie theater, hey I think Groundhog Day is playing!");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.movieTheater.ordinal()] = currentScene;

        currentScene = new Scene("Cadena\'s Home", "CH", "The Cadena\'s House is a historical site known for the creation of the fabled Tin Man");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.cadenasHome.ordinal()] = currentScene;

        currentScene = new Scene("Griffin\'s Home", "GH", "A historical site known for advancing the rights of talking animals");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.griffinsHome.ordinal()] = currentScene;

        currentScene = new Scene("Smith\'s Home", "SH", "Normal town house with a picket fence and 2.5 kids");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.smithsHome.ordinal()] = currentScene;

        currentScene = new Scene("Mayor\'s Office", "MO", "Local Mayor's Office, he has been known to be a little Green");
        currentScene.setActor(new Actor("Spiderman"));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.mayorsOffice.ordinal()] = currentScene;

        currentScene = new Scene("Waterwork\'s Park", "WP", "Waterwork\'s Park is known for their summer activities including a splash pool, does this spot feel warm to you?");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.waterworksPark.ordinal()] = currentScene;

        currentScene = new Scene("Hyde\'s Home", "HH", "Hyde\'s Home, a historical site believed to be the home to a Dr. who's experiment went tragically wrong.");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.hydesHome.ordinal()] = currentScene;

        currentScene = new Scene("Electronic Store", "EL", "The electronic's store, good for all your needs, their prices are shocking");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.electronicStore.ordinal()] = currentScene;

        currentScene = new Scene("Library", "LB", "The library, stop by for a book or to sample their public services.");
        currentScene.setActor(new Actor("Syrin"));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.library.ordinal()] = currentScene;

        currentScene = new Scene("Central Station", "CS", "A fire station located at the center of town. What were you expecting a metro?");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.centralStation.ordinal()] = currentScene;

        currentScene = new Scene("Mayor Johnson\'s Home", "JH", "The mayor\'s illustrious home, some say he used to have the title wizard");
        currentScene.setActor(new Actor("Maul"));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.mayorJohnsonsHome.ordinal()] = currentScene;

        currentScene = new Scene("Eastern Station", "ES", "A fire station on the east side of town");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.easternStation.ordinal()] = currentScene;

        currentScene = new Scene("South Station", "SS", "A fire station on the South side of town");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.southStation.ordinal()] = currentScene;

        currentScene = new Scene("Joel\'s Park", "JP", "Joel\'s park is known for their apple trees, watch out though they've got an arm!");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.joelsPark.ordinal()] = currentScene;

        currentScene = new Scene("Doctor\'s Clinic", "DC", "For your non-emergency medical needs stop in today to see Dr. Frank N Stein.");
        currentScene.setActor(new Actor("Superman"));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.doctorsClinic.ordinal()] = currentScene;

        currentScene = new Scene("Train Station", "TS", "Local trair station, notorious for it's \"Midnight Train\"");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.trainStation.ordinal()] = currentScene;

        currentScene = new Scene("Antonio\'s Park", "AP", "Antonio\'s Park is a great place for picnics and many have been known to nap in the poppy fields there");
        currentScene.setActor(new Actor(""));
        currentScene.setBomb(new Bomb("", ""));
        scenes[SceneType.antoniosPark.ordinal()] = currentScene;

        return scenes;
    }

}
