/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.HideAndSeek.exceptions;

/**
 *
 * @author DragonMaster
 */
public class HeroControlException extends Exception{

    public HeroControlException() {
    }

    public HeroControlException(String message) {
        super(message);
    }

    public HeroControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HeroControlException(Throwable cause) {
        super(cause);
    }

    public HeroControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
