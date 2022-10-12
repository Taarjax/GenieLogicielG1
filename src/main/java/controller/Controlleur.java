/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Panier;
import vue.VueGraphique;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author cd554979
 */
public abstract class Controlleur implements ActionListener{
    Panier m;
    VueGraphique vg;
    
    @Override
    public abstract void actionPerformed(ActionEvent e);   //Invoked when an action occurs
        
    public void setModele(Panier m){
        this.m = m;
    }
    public void setVue(VueGraphique vg){
        this.vg = vg;
    }
}