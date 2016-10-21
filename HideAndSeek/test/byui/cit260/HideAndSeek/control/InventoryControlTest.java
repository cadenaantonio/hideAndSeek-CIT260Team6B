/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DragonMaster
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }

    @Test
    public void testAddToInventory() {
    System.out.println("addToInventory Test case #1");
    int item = 10;
    int amount = 3;
    InventoryControl instance = new InventoryControl();
    int expResult = 13;
    int result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
        
    System.out.println("addToInventory Test case #2");
    item = -45;
    amount = 2;
    expResult = -1;
    result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("addToInventory Test case #3");
    item = -10;
    amount = 15;
    expResult = -1;
    result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("addToInventory Test case #4");
    item = 100;
    amount = 9;
    expResult = -1;
    result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("addToInventory Test case #5");
    item = 15;
    amount = 0;
    expResult = 15;
    result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("addToInventory Test case #6");
    item = 0;
    amount = 15;
    expResult = 15;
    result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("addToInventory Test case #7");
    item = 15;
    amount = 15;
    expResult = 30;
    result = instance.addToInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
    }
@Test
    public void testUseFromInventory() {
    System.out.println("useFromInventory Test case #1");
    int item = 5;
    int amount = 1;
    InventoryControl instance = new InventoryControl();
    int expResult = 4;
    int result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
        
    System.out.println("useFromInventory Test case #2");
    item = 5;
    amount = -1;
    expResult = -1;
    result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("useFromInventory Test case #3");
    item = 0;
    amount = 1;
    expResult = -1;
    result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("useFromInventory Test case #4");
    item = 5;
    amount = 6;
    expResult = -1;
    result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("useFromInventory Test case #5");
    item = 15;
    amount = 0;
    expResult = 15;
    result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("useFromInventory Test case #6");
    item = 0;
    amount = 15;
    expResult = -1;
    result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
        
    System.out.println("useFromInventory Test case #7");
    item = 15;
    amount = 15;
    expResult = 0;
    result = instance.useFromInventory(item, amount);
    assertEquals(expResult, result, 0.0001);
    }
}
