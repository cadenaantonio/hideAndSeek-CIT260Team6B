///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package byui.cit260.HideAndSeek.view;
//
//import byui.cit260.HideAndSeek.control.QuestionControl;
//import byui.cit260.HideAndSeek.exceptions.QuestionControlException;
//import java.util.Scanner;
//
///**
// *
// * @author Antonio Cadena
// */
//public class Story3View2 extends View{
//    
//    public Story3View2() {
//        super("****************************************"
//                + "\n***********Capture the Vilain***********"
//                + "\n**  You have made it this far in the **"
//                + "\n**  game. Now all you have to do is  **"
//                + "\n**   answer the following question   **"
//                + "\n**     correctly to win the game.    **"
//                + "\n**                                   **"
//                + "\n**  What is the area of a barrel that**"
//                + "\n** has a 3in. radius and 6in. height?**"
//                + "\n**                                   **"
//                + "\n***************************************"
//                + "\n***************************************");
//    }
//
//    public String getInput() {
//        Scanner keyboard = new Scanner(System.in);
//        boolean valid = false;
//        String selection = null;
//        
//        while(!valid) {
//            selection = keyboard.nextLine();
//            selection = selection.trim();
//                    
//            if (selection.length() < 0) {
//                System.out.println("\n*** Please enter a real number. ***");
//            }
//            break;
//        }
//        return selection;
//    }
//    
//    public boolean doAction() throws QuestionControlException{
//        String answer = getInput();
//        QuestionControl instance = new QuestionControl();
//        double control = instance.calcAreaBarrel(3, 6);
//        if (control == answer) {
//            
//            
//        }
//        
//        
//    }
//    
//}
