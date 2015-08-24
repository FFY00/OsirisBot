/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.LOGIN;

/**
 *
 * @author FFY00
 */
public class Login {
    public static boolean logado = false;
    public static boolean autenticar(String user, String password){
        String server = pw.osiris.dev.VAR.GLOBAL.server + "?u=" + user + "&p=" + password;
        String resposta = pw.osiris.dev.URL.HTTP.request(server);
        if(resposta.equalsIgnoreCase("nao")){
            pw.osiris.dev.LOGIN.OsirisLoginGUI.labelStatsPassword.setText("Invalid Password");
        }
    }
}
