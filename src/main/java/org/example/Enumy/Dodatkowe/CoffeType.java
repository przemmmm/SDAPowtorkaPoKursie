package org.example.Enumy.Dodatkowe;

import java.sql.SQLOutput;

public enum CoffeType {

    FLAT_WHITE(50, CoffeIntense.MEDIUM),
    CAPPUCINO(40, CoffeIntense.LIGHT),
    ESPRESSO(0, CoffeIntense.STRONG),
    MOCCA(20, CoffeIntense.MEDIUM);

   public  final int milk;
   public final CoffeIntense coffeIntense;

    CoffeType(int milk, CoffeIntense coffeIntense) {
        this.milk = milk;
        this.coffeIntense = coffeIntense;
    }

    public int getMilk() {
        return milk;
    }

    public CoffeIntense getCoffeIntense() {
        return coffeIntense;
    }

    public void returnInfo(){
        if(getCoffeIntense().name().equals("STRONG"))
        {
            System.out.println("o chuj jaka mocna kawa");

        }  else  System.out.println("slaba kawa");
    }
}
