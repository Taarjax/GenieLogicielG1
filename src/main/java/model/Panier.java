package model;

import java.util.*;
/**
 *
 * @author roudet
 */
public class Panier{
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        fruits = new ArrayList<Fruit>();
        this.contenanceMax=contenanceMax;
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        return "";
    }

    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return this.fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
      this.fruits = fruits;
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return fruits.size();
    }

    public int getContenanceMax(){  //accesseur du second attribut
	return this.contenanceMax;
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

    public boolean estVide(){  //predicat indiquant que le panier est vide
	    return fruits.isEmpty();
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein

        return fruits.size()==contenanceMax;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein

       if(estPlein()) throw new PanierPleinException();
       fruits.add(o);
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
        if(estVide()) throw new PanierVideException();
        fruits.remove(fruits.size()-1);
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	return 0;
    }

    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine

    }

    //groupe 8
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        return false;
    }
}
