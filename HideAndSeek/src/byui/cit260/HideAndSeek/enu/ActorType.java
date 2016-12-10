package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum ActorType implements Serializable {

    Batman("Batman", "Gotham City", "Gives Mega-Mind ability."),
    Superman("Superman", "Metropolis", "Gives Flight ablility."),
    Spiderman("Spiderman", "New York City", "Gives Super Sense ability."),
    Siryn("Siryn", "Unknown", "Gives the Sonar ability."),
    Maul("Maul", "Dathomir", "Villan of the game.");

    private String name;
    private String city;
    private String description;

    private ActorType(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ActorType{" + "name=" + name + ", city=" + city + ", description=" + description + '}';
    }
    
}
