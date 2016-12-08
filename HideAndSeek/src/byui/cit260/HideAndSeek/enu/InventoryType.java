package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum InventoryType implements Serializable {



    abilityPotion("Ability Potion", "Healer", 1, "Heals one ability point"),
    abilityElixer("Ability Elixer", "Healer", 1, "Heals all ability points"),
    knife("Knife", "Weapon", 1, "Used to cut wires on bombs"),
    gun("Ice Gun","Weapon", 1, "Used to freeze bombs"),
    handcuff("Handcuffs","Weapon", 1, "Necessary Item to capture Villian"),
    sonar("Sonar","Ability", 1, "Ability give general direction of Villian"),
    superSense("Super Sense","Ability", 1, "Ability to sense if a bomb is nearby"),
    megaMind("Mega Mind","Ability", 1, "Ability to narrow answers to a range"),
    flight("Flight","Ability", 1, "Ability to fly to different location on map");


    private String name;
    private String type;
    private int itemCount;
    private String description;
    
    private InventoryType(String name, String type, int itemCount,String description  ) {
        this.name = name;
        this.description = description;
        this.itemCount = itemCount;
        this.type = type;
      
    }
    
        public String title(){
            return this.name;
        }
    
       public String type(){
        return this.type;
    }
       public int itemCount(){
        return this.itemCount;
    }
       public String description(){
        return this.description;
    }
}