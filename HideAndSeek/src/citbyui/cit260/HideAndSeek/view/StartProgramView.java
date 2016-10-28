/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.HideAndSeek.view;

/**
 *
 * @author DragonMaster
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
        this.promptMessage = "\nPlease enter your name: ";
        // display the banner when the view is created
        this.displayBanner();
    }

    private void displayBanner() {
        System.out.println(
                "\n***************************************************************"
                + "\n***************************************************************"
                + "\n***************************************************************"
                + "\n*------You have entered a world where evil dragons rule.------*"
                + "\n*---Darkness is covering the land and hope is disappearing.---*"
                + "\n*---The only way to bring light and peace to the land is to---*"
                + "\n*----defeat the Evil Dragon Lord with two mystical stones.----*"
                + "\n*---Battle the Evil Dragon Lord's monsters and minions and----*"
                + "\n*-collect the mystical stones to stop the spread of his evil.-*"
                + "\n***************************************************************"
                + "\n***************************************************************"
                + "\n***************************************************************"
        );
    }

    public void displayStartProgramView() {
        
        boolean done = false; //set flag to not done
        do {
            //promptfor and get players name
            this.promptMessage = "\nPlease enter your name: "; //added this because without it, the game looks like it just froze. Expecting an entry without a prompt is a bad idea.
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q")) // user wants to quite
            {
                return; // exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
        }

    private String getPlayersName() {
        System.out.println("\n*** getPlayerName() called***");
        return "Joesph";
    }

    private boolean doAction(String playersName) {
        System.out.println("\n*** doAction() called***");
        return true;
    }
    
    
}
