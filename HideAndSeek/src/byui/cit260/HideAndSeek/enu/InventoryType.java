package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum InventoryType implements Serializable {

    abilityPotion("Ability Potion","Heals one ability point", 1, "Healer"),
    abilityElixer("Ability Elixer","Heals all ability points", 1,"Healer"),
    knife("Knife","Used to cut wires on bombs, PSA do not use bombs",1,"Weapon"),
    iceGun("Ice Gun","Used to freeze bombs, using on milk does not produce ice cream",1,"Weapon"),
    handcuff("Handcuffs"," Necessary Item to capture Villian, warning no safety release",1,"Weapon"),
    sonar("Sonar","A hero's ability used to give general direction of Villian, does not make user a whale",1,"Ability"),
    superSense("Super Sense","A hero's ability to sense if a bomb is nearby, later used for airport security",1,"Ability"),
    megaMind("Mega Mind","A hero's ability to narrow answers to a range, does not work on lottery tickets",1,"Ability"),
    flight("Flight"," A hero's ability to fly to different location on map, NO CAPES",1,"Ability");

    private String name;
    private String description;
    private int itemCount;
    private String type;

    private InventoryType(String name, String description, int itemCount, String type) {
        this.name = name;
        this.description = description;
        this.itemCount = itemCount;
        this.type = type;
      
    }
    public String description(){
        return this.description;
    }
    public String type(){
        return this.type;
    }
    public int itemCount(){
        return this.itemCount;
    }
}
