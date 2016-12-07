package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum InventoryType implements Serializable {

    abilityPotion("Ability Potion","Heals one ability point", 1),
    abilityElixer("Ability Elixer","Heals all ability points", 1),
    knife("Knife","Used to cut wires on bombs, PSA do not use bombs",1),
    gun("Ice Gun","Used to freeze bombs, using on milk does not produce ice cream",1),
    handcuff("Handcuffs"," Necessary Item to capture Villian, warning no safety release",1),
    sonar("Sonar","A hero's ability used to give general direction of Villian, does not make user a whale",1),
    superSense("Super Sense","A hero's ability to sense if a bomb is nearby, later used for airport security",1),
    megaMind("Mega Mind","A hero's ability to narrow answers to a range, does not work on lottery tickets",1),
    flight("Flight"," A hero's ability to fly to different location on map, NO CAPES",1);

    private String name;
    private String description;
    private int itemCount;

    private InventoryType(String name, String description, int itemCount) {
        this.name = name;
        this.description = description;
        this.itemCount = itemCount;
      
}
}
