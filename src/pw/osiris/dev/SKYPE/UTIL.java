/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.SKYPE;

import com.skype.ContactList;
import com.skype.Friend;
import com.skype.Skype;
import com.skype.SkypeClient;
import com.skype.SkypeException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author FFY00
 */
public class UTIL {
    
    public static void iniciar() throws InterruptedException, SkypeException{
        
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
        
        // Hookar com o skype
        Skype.setDaemon(true);
        System.out.println("Hooked with skype!");
        
        // Limpar o historico de Chamada e VoiceMail
        if(pw.osiris.dev.VAR.Config.clearHistory){
            Skype.clearCallHistory();
            System.out.println("Call History cleaned");
            Skype.clearVoiceMailHistory();
            System.out.println("VoiceMail History cleaned");
        }
        
        // Printando os contatos
        
        ContactList contatos = Skype.getContactList();
        Friend amigos[] = contatos.getAllFriends();
        for(int i=0; i < amigos.length; i++){
            Friend f = amigos[i];
            System.out.println(f.getId());
            pw.osiris.dev.VAR.GLOBAL.contatos++;
            Thread.sleep(5);
        }
        System.out.println("\nContacts: " + pw.osiris.dev.VAR.GLOBAL.contatos);
        
        // Autoaccept
        
    }
    
}
