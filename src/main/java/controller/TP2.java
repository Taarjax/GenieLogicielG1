/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package controller;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
import vue.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author cd554979
 */
public class TP2 {

    private VueGraphique vueg;
    
    public VueGraphique getVueg() { //pour java bean
        return vueg; 
    }
    
    public void setVueg(VueGraphique vueg) { //pour java bean
        this.vueg = vueg; 
    }
    
    public static void main(String[] args) {
        File f = new File("src/main/resources/beans.xml");
        System.out.println(f.exists());
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        TP2 test = (TP2)context.getBean("MVC");
        test.setVueg( (VueGraphique)context.getBean("VueG") );
        /*System.out.println("Hello World!");
        Panier p = new Panier(5);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueSwing(p).setVisible(true);
            }
        });
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueAWT(p).setVisible(true);
            }
        });
        */
    }
}
