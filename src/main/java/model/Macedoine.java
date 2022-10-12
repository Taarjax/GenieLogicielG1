package model;

import java.util.*;

public class Macedoine
{
  private ArrayList<Fruit> fruits;
  private boolean seedless = false;

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
    for(int i = 0 ; i < this.fruits.size(); i++)
    {
      res += this.fruits.get(i).getPrix();
    }
    return res +5;
  }

  public boolean isSeedless()
  {
    for(int i = 0 ; i < this.fruits.size(); i++)
    {
      if(fruits.get(i).isSeedless()) seedless = true;
    }
    return seedless;
  }
}
