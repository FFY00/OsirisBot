/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev;

import pw.osiris.dev.LOGIN.OsirisLoginGUI;

/**
 *
 * @author FFY00
 */
public class Osiris {
    public static void main(String[] args){
        System.out.println("Starting " + pw.osiris.dev.VAR.BotInfo.nome + " v" + pw.osiris.dev.VAR.BotInfo.v + " " + pw.osiris.dev.VAR.BotInfo.estado);
        System.out.println("Author: " + pw.osiris.dev.VAR.BotInfo.autor);
        
        // Luigi, essa bosta devia mostrar GUI mas n ta mostrando '-'
        OsirisLoginGUI loginGUI = new OsirisLoginGUI();
        loginGUI.setSize(300, 200);
        loginGUI.setVisible(true);
        
        while(!pw.osiris.dev.VAR.GLOBAL.logado){
            // Faz porra nenhuma :/
            // Bloqueia o programa enquanto espera ppw.osiris.dev.VAR.GLOBAL.logado virar true
        }
    }
}