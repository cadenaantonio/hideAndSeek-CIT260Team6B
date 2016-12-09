package byui.cit260.HideAndSeek.enu;

import java.io.Serializable;

/**
 *
 * @author DragonMaster
 */
public enum InventoryType implements Serializable {



    abilityPotion("Ability Potion", "Healer", 1, "Heals one ability point"),
    abilityElixer("Ability Elixer", "Healer", 1, "Heals all ability points"),
    knife("Knife", "Weapon", 1, "Cuts wires on bombs"),
    iceGun("Ice Gun","Weapon", 1, "Helps freeze bombs"),
    handcuff("Handcuffs","Weapon", 1, "Used to capture Villian"),
    sonar("Sonar","Ability", 1, "Gives Villian's direction"),
    superSense("Super Sense","Ability", 1, "Sense if a bomb is nearby"),
    megaMind("Mega Mind","Ability", 1, "Narrows answers to a range"),
    flight("Flight","Ability", 1, "Fly to location on the map");


    private String nameB;
    private String type;
    private int itemCount;
    private String description;
    
    private InventoryType(String nameB, String type, int itemCount,String description  ) {
        this.nameB = nameB;
        this.description = description;
        this.itemCount = itemCount;
        this.type = type;
      
    }
    
        public String nameB(){
            return this.nameB;
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