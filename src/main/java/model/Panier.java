package model;

import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int cont_max;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int cont_max){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)

        this.cont_max = cont_max;
        this.fruits = new ArrayList<Fruit>();

    }
    
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	int k=0;

        for(int i=0;i<fruits.size();i++){
          k +=fruits.get(i).getPrix();
        }
        return k;
    }
    
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return this.fruits;
    }
    
    public int getTaille(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return fruits.size();
    }
    
    public int getContMax(){  //accesseur du second attribut
	return this.cont_max;
    }
    
    public void setFruits(ArrayList<Fruit> fruits) throws PanierPleinException { //modificateur du premier attribut
        if(fruits.size()>this.cont_max) throw new PanierPleinException();
        this.fruits = fruits;
    }
    
    public boolean estVide(){  //predicat indiquant que le panier est vide
	    return fruits.isEmpty();
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein

        return fruits.size()==cont_max;
    }
    
    /*public void ajout() throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein

       Fruit f = new Fruit();
       if(estPlein()) throw new PanierPleinException();
       fruits.add(f);
    }*/
    
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein

       if(estPlein()) throw new PanierPleinException();
       fruits.add(o);
    }

    //groupe 5
    public void retire() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
       if(estVide()) throw new PanierVideException();
       this.fruits.remove(this.fruits.size()-1);
    }
    
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
        for (int i = 0; i < this.fruits.size(); i++) {
            if(this.getFruit(i).getOrigine()== origine){
               this.fruits.remove(i);
            }
        }
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String str ="Panier de "+getTaille()+" fruits : "+getPrix()+" €\n";
        Map<String,Integer> p = new HashMap<String, Integer>();
        for (Fruit fruit : fruits) {
            if(p.get(fruit.toString())==null)
            {
                p.put(fruit.toString(), 1);
            }
            else
            {
                p.put(fruit.toString(), p.get(fruit.toString())+1);
            }
        }
        for(String k : p.keySet())
        {
            str+=k+" : "+p.get(k)+"\n";
        }
        return str;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	    if(i<0 || i>=fruits.size())
        {
            return null;
        }
        else{
            return fruits.get(i);
        }
    }

    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        if(i>=0 && i<fruits.size())
        {
            fruits.set(i,f);
        }
    }



    

    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
}
