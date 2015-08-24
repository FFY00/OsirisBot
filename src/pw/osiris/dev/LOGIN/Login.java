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
    // autenticar("FFY00", "bundas");
    public static boolean autenticar(String user, String password){
        String server = pw.osiris.dev.VAR.GLOBAL.server + "?u=" + user + "&p=" + password;
        String resposta = pw.osiris.dev.URL.HTTP.request(server);
        return resposta.equalsIgnoreCase("sim");
    }
}
