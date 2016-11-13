/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.QuestionControl;
import java.util.Scanner;

/**
 *
 * @author Antonio Cadena
 */

public class Story3View {
    
    private String displayMessageOne = 
                "\n******************************************************"
               +"\n******************************************************"
               +"\n*** Answer these three question to caputre Maul.   ***"
               +"\n*** What is the area of a barrel?                  ***"
               +"\n*** What is the area of a box?                     ***"
               +"\n*** What is addition?                              ***"
               +"\n***  ***"
               +"\n******************************************************"
               +"\n******************************************************";
        
        private String displayMessageTwo = 
                "\n******************************************************"
               +"\n******************************************************"
               +"\n*** Answer these three question to caputre Maul.   ***"
               +"\n*** What is the area of a barrel?                  ***"
               +"\n*** What is the area of a box?                     ***"
               +"\n*** What is addition?                              ***"
               +"\n***  ***"
               +"\n******************************************************"
               +"\n******************************************************";

    
   //Get unser input for calcAreBarrell
        
    private double getRadius() {//gets input for radius
        Scanner keyboard = new Scanner(System.in);//take input from user keyboard
        boolean valid = false; //initialize as false
        double radius = 0; //initialize radius

        while (!valid) {
            
            System.out.println("\n" +  this.displayMessageOne); // displays the first meessage

                if (radius < 0){ //Validates that all numbers are grater than 0 or positive
                    System.out.println("\n*** You must enter a valid number ***"); //Error message to user number is negative
                }
            
        }

        return radius;
    }
    
    private double getHeight() { // gets input for height
        Scanner keyboard = new Scanner(System.in);//takes input from user keyboard
        boolean valid = false; // initialize as false
        double height = 0; // initialize heights

        while (!valid) {
            
            System.out.println("\n" +  this.displayMessageTwo);  // displays the second meessage

                if (height < 0){ //Validates that all numbers are grater than 0 or positive
                    System.out.println("\n*** You must enter a valid number ***"); //Error message to user number is negative
                }
            
        }

        return height;
    }
    }
   //Do calculation
    private void doAction() {
        radius = getRadius();
        height = getHeight();

        QuestionControl instance = new QuestionControl();
        
        double areaR = QuestionControl.calcAreaBarrel(radius, height);
    }
    
   //if ansered correctly then proceed to the next one of try once more.
    
   //Get user input for calcAreaBox
   //Do calculation
    
   //If ansere correctly then proceed to the last question.
    
   //Get user input for calcAddition
   //Do the calculation
    
   //If all are ansered correctly then you have caputued the Maul.
   //Dispalay banner Congratulatin you for the capturing Maul. 
   //Exit the game.
    
}
