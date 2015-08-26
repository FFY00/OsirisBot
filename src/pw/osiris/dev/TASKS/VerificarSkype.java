/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.TASKS;

import com.skype.Skype;
import com.skype.SkypeException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FFY00
 */
public class VerificarSkype {
    
    public static void verificar() throws InterruptedException, SkypeException{
        
        // Verificar se skype esta instalado
        if(!Skype.isInstalled()){
            System.out.println("Skype not found in the computer!");
            JOptionPane.showMessageDialog(new JFrame(), "Skype not found in the computer!", "Error", JOptionPane.ERROR_MESSAGE);
            Thread.sleep(5);
            System.exit(0);
        }
        
        // Verificar se skype esta aberto
        if(Skype.isRunning()){
            System.out.println("Skype isn't running!");
            JOptionPane.showMessageDialog(new JFrame(), "Skype isn't running!", "Error", JOptionPane.ERROR_MESSAGE);
            Thread.sleep(5);
            System.exit(0);
            
        }
    }
    
}
