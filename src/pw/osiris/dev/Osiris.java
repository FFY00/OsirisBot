/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev;

import com.skype.SkypeException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author FFY00
 */
public class Osiris {
    public static void main(String[] args){
        System.out.println("Starting " + pw.osiris.dev.VAR.BotInfo.nome + " v" + pw.osiris.dev.VAR.BotInfo.v + " " + pw.osiris.dev.VAR.BotInfo.estado);
        System.out.println("Author: " + pw.osiris.dev.VAR.BotInfo.autor + "\n");
        pw.osiris.dev.LOGIN.OsirisLoginGUI2.main(args);
        while(!pw.osiris.dev.VAR.GLOBAL.logado){
            /**
             * Faz porra nenhuma :/
             * Bloqueia o programa enquanto espera ppw.osiris.dev.VAR.GLOBAL.logado virar true
             */ 
            // Dev Testing
            //System.out.println(".");
        }
        if(pw.osiris.dev.VAR.GLOBAL.logado){ // So pra confirmar que ta logado e_e
            System.out.println("\nStarting OsirisBot");
            
            // Esconder LoginGUI
            pw.osiris.dev.LOGIN.OsirisLoginGUI2.formLogin.setVisible(false);
            System.out.println("Login GUI has been hidden");
            
            // Verificar Skype
            try {
                pw.osiris.dev.TASKS.VerificarSkype.verificar();
            } catch (InterruptedException ex) {
                System.out.println("Error while checking if skype is instaled");
            } catch (SkypeException ex) {
                System.out.println("Error while checking if skype is running");
            }
            System.out.println("Skype found");

            // Mostrar GUI
            pw.osiris.dev.GUI.OsirisGUI.main(args);
            System.out.println("Osiris GUI panel has been showed");
            
            // Hook com skype
            try {
                pw.osiris.dev.SKYPE.UTIL.iniciar();
            } catch (InterruptedException ex) {
                System.out.println("Error: 1");
            } catch (SkypeException ex) {
                System.out.println("Error: 2");
            }
            
            
        }
    }
}