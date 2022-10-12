/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ma618349
 */
public class Cerise extends FruitSimple{
	
    public Cerise() 
    {
        super(1.5,"France");
    }
    
    public Cerise(double prix, String origine) 
    {
	super(prix,origine);  
    }
    
    
    @Override
    public String toString(){
        return "Cerise"+super.toString();
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            return super.equals(o);
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }
    
}
