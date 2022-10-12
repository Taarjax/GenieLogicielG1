/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import model.Orange;

/**
 *
 * @author cd554979
 */
public class ControlleurComplet extends Controlleur {
    public void actionPerformed(ActionEvent e)
    {
        JTextArea c = (JTextArea)TestUtils.getChildNamed(((Component)e.getSource()).getParent(), "Texte");
        String txt;
        try{
            if(((Component)e.getSource()).getName().equals("Plus")) 
            {
                JComboBox<String> chx = (JComboBox<String>)TestUtils.getChildNamed(((Component)e.getSource()).getParent(), "Choix");
                String val = (String)chx.getSelectedItem();
                switch(val)
                {
                    case "Orange":
                        super.m.ajout(new Orange());
                        break;
                    case "Cerise":
                        break;
                    case "Banane":
                        break;
                }
                txt = super.m.toString();
            }
            else
            {
                super.m.retire();
                txt = super.m.toString();
            }
            c.setText(txt);
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
