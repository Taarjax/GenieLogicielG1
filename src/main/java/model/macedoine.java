package model;

import java.util.*;

public class Macedoine
{
  private ArrayList<Fruit> fruits;
  private bool seedless;

  public Macedoine(Fruit f)
  {
    fruits = new ArrayList<Fruit>();
  }

  public void ajoute(Fruit f)
  {
    this.fruits.add(f);
  }

  @Override
  public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
      String str ="La macédoine est composée des fruits suivants:\n";
      for(int i = 0 ; i < fruits.size(); i++)
      {
        str += fruits.get(i).toString() + "\n";
      }
      return str;
  }


  public double getPrix()
  {
    float res = 0;
    for(int i = 0 ; i < fruits.size(); i++)
    {
      res += fruits.get(i).getPrix();
    }
    return float( res/fruits.size() );
  }

  public void isSeedless()
  {
    for(int i = 0 ; i < fruits.size(); i++)
    {
      if(!fruits.get(i).getPrix()) seedless = false;
      else seedless = true;
    }
  }

}
