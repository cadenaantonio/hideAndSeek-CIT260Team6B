/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.control;

/**
 *
 * @author DragonMaster
 */
public class InventoryControl {

    public int addToInventory(int item, int amount) {

        if (item < 0 || item > 15) {
            return -1;
        }

        if (amount < 0 || amount > 15) {
            return -1;
        }

        int addToInventory = item + amount;
        return addToInventory;
    }

    public int useFromInventory(int item, int amount) {

        if (item < 0 || item > 15) {
            return -1;
        }

        if (amount < 0 || amount > 15 || amount > item) {
            return -1;
        }

        int useFromInventory = item - amount;
        return useFromInventory;
    }
}
