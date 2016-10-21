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
public class QuestionControl {
    
    public double calcAreaBarrel(double radius, double height){
        if (radius < 0 || radius > 12){
	return -1;
    }
        if (height < 0 || height > 11){
            return -1;
                }

        double area = (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
        double areaR = Math.round(area * 100.0) / 100.0;

        return areaR;
    }
    
}
