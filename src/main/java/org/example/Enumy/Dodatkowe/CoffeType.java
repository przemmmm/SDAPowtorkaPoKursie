package org.example.Enumy.Dodatkowe;

import java.sql.SQLOutput;

public enum CoffeType {

    FLAT_WHITE(50, CoffeIntense.MEDIUM),
    CAPPUCINO(40, CoffeIntense.LIGHT),
    ESPRESSO(0, CoffeIntense.STRONG),
    MOCCA(20, CoffeIntense.MEDIUM);

   public int milk;
   public CoffeIntense coffeIntense;

    CoffeType(int milk, CoffeIntense coffeIntense) {
        this.milk = milk;
        this.coffeIntense = coffeIntense;
    }

    public void returnInfo(){
        if(coffeIntense.equals("STRONG")){
            System.out.println("o chuj jaka mocna kawa");
        }
        System.out.println("slaba kawa");
    }
}
