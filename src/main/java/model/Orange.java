package model;
/**
 *
 * @author roudet
 */
public class Orange extends FruitSimple{
	
    public Orange() 
    {
        super(1.0,"Espagne");
    }
    
    public Orange(double prix, String origine) 
    {
	super(prix,origine);  
    }

    @Override
    public String toString(){
        return "Orange "+super.toString();
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
