package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum SceneType implements Serializable {

    smithsMarketplace("Smith\'s Marketplace", "SM", "Local grocery store"),
    andersonHome("Anderson Home", "AH", "Historical landmark"),
    hospital("Hospital", "HS", "The hospital, here for your medical emergencies and dramatic t.v. viewing."),
    megsPark("Meg\'s Park", "MP", "A lush park known for hosting the winter festivle"),
    northStation("North Station", "NS", "A fire station at the north end of town"),
    westernStation("Western Station", "WS", "A fire station at the west side of town, strangely it doesn't have a story."),
    centralPark("Central Park", "CP", " A mirror of New York City's Central Park it is known for it's carousel, however many of the animals have been switched out due to politcal correctness"),
    printShop("Print Shop", "PS", "Local print shop for all your business needs, will not print life size posters of actors."),
    movieTheater("Movie Theater", "MT", "Local movie theater, hey I think Groundhog Day is playing!"),
    cadenasHome("Cadena\'s Home", "CH", "The Cadena\'s House is a historical site known for the creation of the fabled Tin Man"),
    griffinsHome("Griffin\'s Home", "GH", "A historical site known for advancing the rights of talking animals"),
    smithsHome("Smith\'s Home", "SH", "Normal town house with a picket fence and 2.5 kids"),
    mayorsOffice("Mayor\'s Office", "MO", "Local Mayor's Office, he has been known to be a little Green"),
    waterworksPark("Waterwork\'s Park", "WP", "Waterwork\'s Park is known for their summer activities including a splash pool, does this spot feel warm to you?"),
    hydesHome("Hyde\'s Home", "HH", "Hyde\'s Home, a historical site believed to be the home to a Dr. who's experiment went tragically wrong."),
    electronicStore("Electronic Store", "EL", "The electronic's store, good for all your needs, their prices are shocking"),
    library("Library", "LB", "The library, stop by for a book or to sample their public services."),
    centralStation("Central Station", "CS", "A fire station located at the center of town. What were you expecting a metro?"),
    mayorJohnsonsHome("Mayor Johnson\'s Home", "JH", "The mayor\'s illustrious home, some say he used to have the title wizard"),
    easternStation("Eastern Station", "ES", "A fire station on the east side of town"),
    southStation("South Station", "SS", "A fire station on the South side of town"),
    joelsPark("Joel\'s Park", "JP", "Joel\'s park is known for their apple trees, watch out though they've got an arm!"),
    doctorsClinic("Doctor\'s Clinic", "DC", "For your non-emergency medical needs stop in today to see Dr. Frank N Stein."),
    trainStation("Train Station", "TS", "Local trair station, notorious for it's \"Midnight Train\""),
    antoniosPark("Antonio\'s Park", "AP", "Antonio\'s Park is a great place for picnics and many have been known to nap in the poppy fields there");
    
    private String nameA;
    private String symbol;
    private String description;

    private SceneType(String nameA, String symbol, String description  ) {
        this.nameA = nameA;
        this.description = description;
        this.symbol = symbol;
      
    }
    
        public String nameA(){
            return this.nameA;
        }
    
       public String symbol(){
        return this.symbol;
    }
       
       public String description(){
        return this.description;
    }
    
}
