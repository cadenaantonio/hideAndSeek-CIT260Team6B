package byui.cit260.HideAndSeek.view;

import hideandseek.HideAndSeek;
import java.io.PrintWriter;

/**
 *
 * @author DragonMaster
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = HideAndSeek.getOutFile();
    private static final PrintWriter logFile = HideAndSeek.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
        "-----------------------------------------------------"
        + "\n- ERROR - " + errorMessage
        + "\n-----------------------------------------------------");
        
        // log error
        logFile.println(className + " - " + errorMessage);
        
    }
    
}
