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
    }
    
}
