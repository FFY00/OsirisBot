/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.TASKS;

/**
 *
 * @author FFY00
 */
public class LOG {
    
    public void log(String texto){
        System.out.println(texto);
        new pw.osiris.dev.GUI.OsirisGUI().escreverLog(texto);
    }
    
}