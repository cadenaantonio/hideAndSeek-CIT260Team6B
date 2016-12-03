package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum ActorType implements Serializable {

    Batman("Batman", "Hero of Gotham City. Teaches you Mega-Mind ability."),
    Superman("Superman", "Hero of Metropolis. Teaches you the Flight ablility."),
    Spiderman("Spiderman", "Hero of New York City. Teaches you the Super Sense ability."),
    Siryn("Siryn", "Hero with super sonic voice. Teaches you the Sonar ability."),
    Maul("Maul", "Villan of the game.");

    private String name;
    private String description;

    private ActorType(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "ActorType{" + "name=" + name + ", description=" + description + '}';
    }

}
