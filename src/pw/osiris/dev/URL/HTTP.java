/*
 * Copyright 2015 FFY00.
 *
 * All Rights Reserved
 */
package pw.osiris.dev.URL;

import java.io.IOException;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author FFY00
 */
public class HTTP {
        public static String request(String urlloc) {
        try {
            java.net.URL url = new java.net.URL(urlloc);
            URLConnection openConnection = url.openConnection();
            openConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
            Scanner r = new Scanner(openConnection.getInputStream());
            StringBuilder sb = new StringBuilder();
            while (r.hasNext()) {
                    sb.append(r.next() + " ");
            }
            r.close();
            return sb.toString();
        } catch (IOException e) {
        }
    return null;
    }
}
