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
        this.prix = prix ; 
        this.origine = origine ; 
    }
    
      public double getPrix(){
          return this.prix ;
      }
      
      public String getOrigne(){
          return this.origine ; 
      }
      
      public boolean isSeedless(){
          return false ; 
      }
      
      @Override
      public boolean equals(Object o){
            if(o != null && getClass() == o.getClass()){
            Orange or = (Orange) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
            
       }
        
    @Override
    public String toString(){
        return "Fruit venant de " + origine + " a " + prix + " euros";
    }
    
    
}
