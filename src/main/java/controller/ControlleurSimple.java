/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import model.Orange;

/**
 *
 * @author cd554979
 */
public class ControlleurSimple extends Controlleur{
    public void actionPerformed(ActionEvent e)
    {
        JLabel c = (JLabel)TestUtils.getChildNamed(((Component)e.getSource()).getParent(), "Compteur");
        try{
            if(((Component)e.getSource()).getName().equals("Plus")) 
            {
                super.m.ajout(new Orange());
                c.setText(super.m.getTaille()+"");
            }
            else
            {
                super.m.retire();
                c.setText(super.m.getTaille()+"");
            }
        }catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}