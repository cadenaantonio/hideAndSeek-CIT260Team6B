/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.QuestionControl;
import byui.cit260.HideAndSeek.exceptions.QuestionControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DragonMaster
 */
public class Story1View extends View{
    
    Story1View() {
        super("Find the volume of a barrel. What is the radius of the barrel?");
    }

    //Get unser input for calcAreBarrell
    private double getRadius() {//gets input for radius
        Scanner keyboard = new Scanner(System.in);//take input from user keyboard
        boolean valid = false; //initialize as false
        double radius = 0; //initialize radius

        while (!valid) {

            //System.out.println("\n" + this.displayMessageOne); // displays the first meessage

            if (radius < 0) { //Validates that all numbers are grater than 0 or positive
                System.out.println("\n*** You must enter a valid number ***"); //Error message to user number is negative
            }

        }

        return radius;
    }

    private double getHeight() { // gets input for height
        Scanner keyboard = new Scanner(System.in);//takes input from user keyboard
        boolean valid = false; // initialize as false
        double height = 0; // initialize heights
        displayMessage = "What is the barrel height?";
        do {
            String sHeight = getInput();
            try {
                height = Double.parseDouble(sHeight);
            } catch (NumberFormatException e) {
                System.out.println("\n Please enter a valid number.");
                return height = -1;
            }
        } while (height <= 0);

        return height;
    }

    @Override
    public boolean doAction(String value) {
        //radius = getRadius();
        double radius = 0;
        try {
            radius = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("\n Please enter a valid number.");
            return false;
        }

        double height = getHeight();

        QuestionControl instance = new QuestionControl();

        try {
            double areaR = instance.calcVolumeBarrel(radius, height);
            System.out.println("The area of your barrel is " + areaR + ".");
        } catch (QuestionControlException ex) {
            Logger.getLogger(Story3View.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
}
