/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.TASKS;

import com.skype.Friend;
import com.skype.Skype;
import com.skype.SkypeException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author FFY00
 */
public class AutoAccept {
    
    // Aceita Contatos
    public static int aceitarContatos() throws SkypeException{
        Friend[] contatosAceitar = Skype.getContactList().getAllUserWaitingForAuthorization();
        int aceites = 0;
        for(Friend aceitar : contatosAceitar){
            aceitar.setAuthorized(true);
            aceitar.send(pw.osiris.dev.VAR.MSG.novoUser);
            aceites++;
        }
        return aceites;
    }
    
    // Cria um sheduler
    public static final ScheduledExecutorService tarefas = Executors.newScheduledThreadPool(1);
    
    // Cria tarefa que chama aceitarContatos()
    public static void autoAceitar(){
        tarefas.scheduleAtFixedRate(new Runnable() {
            public void run() {
                
                // chama o aceitarContatos()
                try {
                   int aceites = aceitarContatos();
                } catch (SkypeException ex) {
                    System.out.println("Error while accepting new contacts");
                }
                
            }
        }, 0, 15, TimeUnit.SECONDS);
        System.out.println("AutoAccept registered");
    }
    
}
