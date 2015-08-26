/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev;


/**
 *
 * @author FFY00
 */
public class Osiris {
    public static void main(String[] args){
        System.out.println("Starting " + pw.osiris.dev.VAR.BotInfo.nome + " v" + pw.osiris.dev.VAR.BotInfo.v + " " + pw.osiris.dev.VAR.BotInfo.estado);
        System.out.println("Author: " + pw.osiris.dev.VAR.BotInfo.autor);
        pw.osiris.dev.LOGIN.OsirisLoginGUI2.main(args);
        while(!pw.osiris.dev.VAR.GLOBAL.logado){
            // Faz porra nenhuma :/
            // Bloqueia o programa enquanto espera ppw.osiris.dev.VAR.GLOBAL.logado virar true
        }
    }
}