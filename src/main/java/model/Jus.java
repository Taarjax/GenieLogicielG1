/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


import java.util.*;
/**
 *
 * @author md087302
 */
public class Jus {
    private Fruit fruit;  //attribut pour stocker les fruits
    
    
    public Jus(Fruit f) 
    {
        this.fruit=f;
    }
    
    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return this.fruit.isSeedless();
    }
    
    @Override
    public String toString(){
        return "jus de " + this.fruit.getClass().getSimpleName()+ " a " + this.getPrix() + " euros";
    }

    
    public double getPrix(){
        return this.fruit.getPrix()+5;
    }
    
}
