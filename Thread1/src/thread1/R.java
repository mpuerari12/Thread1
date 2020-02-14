/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author puerari.martin
 */
public class R implements Runnable {

    private char c;

    R(char c) {

    }

    public void run() {

            while (true) {
                System.out.println("Ciao sono Thread, implemento Runnable " + this.c);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(R.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
