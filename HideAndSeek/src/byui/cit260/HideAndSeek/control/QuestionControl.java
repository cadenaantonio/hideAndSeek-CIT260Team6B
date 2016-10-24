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
    
    public double calcVolumeSphere(double radius) {
        if (radius < 0 || radius > 45) {
            return -1;
        }
        
        double volume = Math.pow(radius, 3)* Math.PI * 4/3 ;
        double volumeR = Math.round(volume * 100.0) / 100.0;
        
        return volumeR;
    }
    
    public double calcAreaBox(double length, double width, double height){
        if (length < 0 || length > 38) {
            return -1;
        }
        if(width < 0 || width > 42) {
            return -1;
        }
        if(height < 0 || height > 50) {
            return -1;
        }
        
        double area = 2 * (height * width) + 2 * (height * length) + 2 * (width * length);
        double areaR = Math.round(area * 100.0) / 100.0;
        
        return areaR;
    }
    
    public double calcVolumePyramid (double length, double width, double height) {
        if (length < 0 || length > 10) {
            return -1;
        }
        if(width < 0 || width > 10) {
            return -1;
        }
        if(height < 0 || height > 10) {
            return -1;
        }
        
        double volume = length * width * height / 3;
        double volumeR= Math.round(volume * 100.0) / 100.0;
        
        return volumeR;
    }
    
    public double calcAddition (double var1, double var2) {
        if (var1 < 0 || var1 > 99) {
            return -1;
        }
        if (var2 < 0 || var2 > 99) {
            return -1;
        }
        
        double addition = var1 + var2;
        double additionR = Math.round(addition * 100.0) /100.0;
        
        return additionR;
    }
    
    public double calcSubtraction (double var1, double var2) {
        if (var1 < 0 || var1 > 99) {
            return -1;
        }
        if (var2 < 0 || var2 > 99) {
            return -1;
        }
        
        double subtraction = var1 - var2;
        double subtractionR = Math.round(subtraction * 100.0) /100.0;
        
        return subtractionR;
    }
    
    public double calcMultiplication(double var1, double var2){
        if(var1 < 0 || var1 > 99){
            return -1;
        }
        
        if(var2 < 0 | var2 > 99){
            return -1;
        }
        
        double multiplication = var1 * var2;
        
        return multiplication;

    }
    
    public double calcDivision(double var1, double var2){
        if(var1 < 0 || var1 > 99){
            return -1;
        }
        
        if(var2 < 1 || var2 > 99){
	return -1;
        }
        
        double division = var1 / var2;
        double divisionR = Math.round(division * 100.0) /100.0;
        
        return division;
    }
    public double calcDiameterOfBarrel (double radius){
        if(radius < 0 || radius > 1300){
            return -1;
    }
        double diameter = radius * 2;
        double diameter2 = Math.round(diameter *100.0)/100.0;
        
        return diameter2;
    }
    
    public double calcRadiusBarrel(double volume, double height){
        if(volume < 0 || volume >50)
            return -1;
        if (height <0 || height >9)
            return -1;
    
    double radius = Math.sqrt(volume / (Math.PI * height));
    double radius2 = Math.round(radius *100.0)/100.0;
    
    return radius2;
}
    public double calcVolumeBarrel(double radius, double height){
        if(radius <0 || radius > 15)
            return -1;
        if(height <0 || height > 24)
            return -1;
        
           double volume = Math.PI * Math.pow(radius, 2) * height;
           double volume2= Math.round(volume*100.0)/100.0;
           return volume2;
    }
    
    public double calcAreaCircle(double radius){
        if(radius <0 || radius >26)
            return -1;
        
            double area = Math.PI * Math.pow(radius, 2);
            double area2 = Math.round(area *100.0)/100.0;
            
            return area2;
    }
    
    public double calcDiameterSphere(double radius){
        if(radius<0 || radius>100)
            return -1;
        
            double diameter= radius * 2;
            double diameter2= Math.round(diameter*100.0)/100.0;
            
            return diameter2;
    }
}
