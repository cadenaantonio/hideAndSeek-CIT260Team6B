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

   @Test
    public void testcalcVolumeSphere() {
        
        System.out.println("calcVolumeSphere Test case #1");
        double radius = 22;
        QuestionControl instance = new QuestionControl();
        double expResult = 44602.24;
        double result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeSphere Test case #2");
        radius = -1;
        expResult = -1;
        result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeSphere Test case #3");
        radius = 88;
        expResult = -1;
        result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeSphere Test case #4");
        radius = 65;
        expResult = -1;
        result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeSphere Test case #5");
        radius = 0;
        expResult = 0;
        result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeSphere Test case #6");
        radius = 45;
        expResult = 381703.51;
        result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumeSphere Test case #7");
        radius = 45;
        expResult = 381703.51;
        result = instance.calcVolumeSphere(radius);
        assertEquals(expResult, result, 0.0001);
    }

    @Test
    public void testcalcAreaBox() {
        System.out.println("calcAreaBox Test case #1");
        double legth = 4;
        double width = 6;
        double heigth = 3;
        QuestionControl instance = new QuestionControl();
        double expResult = 108;
        double result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBox Test case #2");
        legth = -8;
        width = 5;
        heigth = 4;
        expResult = -1;
        result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBox Test case #3");
        legth = 5;
        width = -4;
        heigth = 7;
        expResult = -1;
        result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBox Test case #4");
        legth = 38;
        width = 47;
        heigth = 46;
        expResult = -1;
        result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBox Test case #5");
        legth = 0;
        width = 0;
        heigth = 0;
        expResult = 0;
        result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBox Test case #6");
        legth = 38;
        width = 0;
        heigth = 0;
        expResult = 0;
        result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAreaBox Test case #7");
        legth = 38;
        width = 42;
        heigth = 50;
        expResult = 11192;
        result = instance.calcAreaBox(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
    }
    
    @Test
    public void testcalcVolumePyramid() {
        System.out.println("calcVolumePyramid Test case #1");
        double legth = 1;
        double width = 2;
        double heigth = 3;
        QuestionControl instance = new QuestionControl();
        double expResult = 2;
        double result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("calcVolumePyramid Test case #2");
        legth = -1;
        width = 2;
        heigth = 3;
        expResult = -1;
        result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumePyramid Test case #3");
        legth = 1;
        width = -2;
        heigth = 3;
        expResult = -1;
        result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumePyramid Test case #4");
        legth = 1;
        width = 5;
        heigth = 60;
        expResult = -1;
        result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumePyramid Test case #5");
        legth = 10;
        width = 0;
        heigth = 0;
        expResult = 0;
        result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumePyramid Test case #6");
        legth = 0;
        width = 10;
        heigth = 0;
        expResult = 0;
        result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcVolumePyramid Test case #7");
        legth = 10;
        width = 10;
        heigth = 1;
        expResult = 33.33;
        result = instance.calcVolumePyramid(legth, width, heigth);
        assertEquals(expResult, result, 0.0001);
    } 
    
    @Test
    public void testcalcAddition() {
        System.out.println("calcAddition Test case #1");
        double var1 = 4;
        double var2 = 6;
        QuestionControl instance = new QuestionControl();
        double expResult = 10;
        double result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("calcAddition Test case #2");
        var1 = 45;
        var2 = 3;
        expResult = 48;
        result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAddition Test case #3");
        var1 = -12;
        var2 = 22;
        expResult = -1;
        result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAddition Test case #4");
        var1 = 88;
        var2 = -21;
        expResult = -1;
        result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAddition Test case #5");
        var1 = 0;
        var2 = 99;
        expResult = 99;
        result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAddition Test case #6");
        var1 = 99;
        var2 = 0;
        expResult = 99;
        result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcAddition Test case #7");
        var1 = 99;
        var2 = 99;
        expResult = 198;
        result = instance.calcAddition(var1, var2);
        assertEquals(expResult, result, 0.0001);
    }
    
    @Test
    public void testcalcSubtraction() {
        System.out.println("calcSubtraction Test case #1");
        double var1 = 45;
        double var2 = 22;
        QuestionControl instance = new QuestionControl();
        double expResult = 23;
        double result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("calcSubtraction Test case #2");
        var1 = -99;
        var2 = 75;
        expResult = -1;
        result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcSubtraction Test case #3");
        var1 = 24;
        var2 = -55;
        expResult = -1;
        result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcSubtraction Test case #4");
        var1 = 100;
        var2 = 45;
        expResult = -1;
        result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcSubtraction Test case #5");
        var1 = 25;
        var2 = 5;
        expResult = 20;
        result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcSubtraction Test case #6");
        var1 = 99;
        var2 = 0;
        expResult = 99;
        result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcSubtraction Test case #7");
        var1 = 99;
        var2 = 99;
        expResult = 0;
        result = instance.calcSubtraction(var1, var2);
        assertEquals(expResult, result, 0.0001);
    }
    
        @Test
    public void testcalcMultiplication() {
        System.out.println("calcMultiplication Test case #1");
        double var1 = 2;
        double var2 = 14;
        QuestionControl instance = new QuestionControl();
        double expResult = 28;
        double result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("calcMultiplication Test case #2");
        var1 = -4;
        var2 = 9;
        expResult = -1;
        result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcMultiplication Test case #3");
        var1 = 6;
        var2 = -7;
        expResult = -1;
        result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcMultiplication Test case #4");
        var1 = 201;
        var2 = 5;
        expResult = -1;
        result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcMultiplication Test case #5");
        var1 = 0;
        var2 = 99;
        expResult = 0;
        result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcMultiplication Test case #6");
        var1 = 99;
        var2 = 0;
        expResult = 0;
        result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcMultiplication Test case #7");
        var1 = 99;
        var2 = 99;
        expResult = 9801;
        result = instance.calcMultiplication(var1, var2);
        assertEquals(expResult, result, 0.0001);
    }
    
            @Test
    public void testcalcDivision() {
        System.out.println("calcDivision Test case #1");
        double var1 = 6;
        double var2 = 8;
        QuestionControl instance = new QuestionControl();
        double expResult = 0.75;
        double result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        
        System.out.println("calcDivision Test case #2");
        var1 = -5;
        var2 = 4;
        expResult = -1;
        result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcDivision Test case #3");
        var1 = 9;
        var2 = -7;
        expResult = -1;
        result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcDivision Test case #4");
        var1 = 217;
        var2 = 5;
        expResult = -1;
        result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcDivision Test case #5");
        var1 = 0;
        var2 = 99;
        expResult = 0;
        result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcDivision Test case #6");
        var1 = 99;
        var2 = 1;
        expResult = 99;
        result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
        
        System.out.println("calcDivision Test case #7");
        var1 = 99;
        var2 = 99;
        expResult = 1;
        result = instance.calcDivision(var1, var2);
        assertEquals(expResult, result, 0.0001);
    }
        @Test
    public void testcalcDiameterOfBarrel() {
        System.out.println("calcDiameterOfBarrel Test case #1");
        double radius =2;
        QuestionControl instance = new QuestionControl();
        double expResult =4;
        double result = instance.calcDiameterOfBarrel(radius);
        assertEquals(expResult, result, 0.0001);
        
         System.out.println("calcDiameterOfBarrel Test case #2");
        radius =-65;
        expResult =-1;
        result = instance.calcDiameterOfBarrel(radius);
        assertEquals(expResult, result, 0.0001);
        
         System.out.println("calcDiameterOfBarrel Test case #3");
        radius =1301;
        expResult =-1;
        result = instance.calcDiameterOfBarrel(radius);
        assertEquals(expResult, result, 0.0001);
        
         System.out.println("calcDiameterOfBarrel Test case #5");
        radius =0;
        expResult =0;
        result = instance.calcDiameterOfBarrel(radius);
        assertEquals(expResult, result, 0.0001);
        
         System.out.println("calcDiameterOfBarrel Test case #6");
        radius =1300;
        expResult =2600;
        result = instance.calcDiameterOfBarrel(radius);
        assertEquals(expResult, result, 0.0001);
        
         System.out.println("calcDiameterOfBarrel Test case #7");
        radius =1300;
        expResult =2600;
        result = instance.calcDiameterOfBarrel(radius);
        assertEquals(expResult, result, 0.0001);
    }  
}
