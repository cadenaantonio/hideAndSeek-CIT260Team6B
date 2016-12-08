package byui.cit260.HideAndSeek.view;

import byui.cit260.HideAndSeek.control.QuestionControl;
import byui.cit260.HideAndSeek.exceptions.QuestionControlException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonio Cadena
 */
public class Story2View extends View {

    Story2View() {
        super("Please enter a multiplicant (the number you wish to multiply)");
    }

    //Get unser input for calcAreBarrell
    private double getVar1() {//gets input for radius
        Scanner keyboard = new Scanner(System.in);//take input from user keyboard
        boolean valid = false; //initialize as false
        double var1 = 0; //initialize radius
        
        while (!valid) {
            if (var1 < 0) { //Validates that all numbers are grater than 0 or positive
                System.out.println("\n*** You must enter a valid number ***"); //Error message to user number is negative
            }
        }

        return var1;
    }

    private double getVar2() { // gets input for height
        Scanner keyboard = new Scanner(System.in);//takes input from user keyboard
        boolean valid = false; // initialize as false
        double var2 = 0; // initialize heights
        displayMessage = "Enter the multiplier (the number of times you wish to multiply by)";
        do {
            String sVar2 = getInput();
            try {
                var2 = Double.parseDouble(sVar2);
            } catch (NumberFormatException e) {
                System.out.println("\n Please enter a valid number.");
                return var2 = -1;
            }
        } while (var2 <= 0);

        return var2;
    }

    @Override
    public boolean doAction(String value) {
        //radius = getRadius();
        double var1 = 0;
        try {
            var1 = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            System.out.println("\n Please enter a valid number.");
            return false;
        }
        double var2 = getVar2();
        QuestionControl instance = new QuestionControl();
        try {
            double multiplication = instance.calcMultiplication(var1, var2);
            System.out.println( var1 + "x" + var2 + "=" + multiplication + ".");
        } catch (QuestionControlException ex) {
            Logger.getLogger(Story2View.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
