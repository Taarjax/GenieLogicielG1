/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 *
 * @author ma618349
 */
public abstract class FruitSimple implements Fruit{
    private double prix;
    private String origine ; 
    
    public FruitSimple(double prix , String origine){
        if(prix<0)
            this.prix = -prix ;
        else
            this.prix = prix;
        if(!origine.isBlank())
            this.origine = origine ; 
        else
            this.origine = "Espagne";
    }
    
      public double getPrix(){
          return this.prix ;
      }
      
      public String getOrigine(){
          return this.origine ; 
      }
      
      public boolean isSeedless(){
          return false ; 
      }
      
      @Override
      public boolean equals(Object o){
            if(o != null && getClass() == o.getClass()){
            FruitSimple or = (FruitSimple) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
            
       }
        
    @Override
    public String toString(){
        return " de " + origine + " a " + prix + " euros";
    }
    
    
}
