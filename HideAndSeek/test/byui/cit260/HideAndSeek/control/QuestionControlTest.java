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
public class QuestionControlTest {
    
    public QuestionControlTest() {
    }

    @Test
    public void testCalcAreaBarrel() {
        System.out.println("calcAreaBarrel Test case #1");
        double radius = 3;
        double height = 5;
        QuestionControl instance = new QuestionControl();
        double expResult = 150.8;
        double result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);

        System.out.println("calcAreaBarrel Test case #2");
        radius = -3;
        height = 5;
        expResult = -1;
        result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBarrel Test case #3");
        radius = 3;
        height = -5;
        expResult = -1;
        result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBarrel Test case #4");
        radius = 5;
        height = 13;
        expResult = -1;
        result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);
        
       System.out.println("calcAreaBarrel Test case #5");
        radius = 0;
        height = 11;
        expResult = 0;
        result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBarrel Test case #6");
        radius = 12;
        height = 0;
        expResult = 904.78;
        result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBarrel Test case #7");
        radius = 12;
        height = 11;
        expResult = 1734.16;
        result = instance.calcAreaBarrel(radius, height);
        assertEquals(expResult, result, 0.0001);
    }
}
