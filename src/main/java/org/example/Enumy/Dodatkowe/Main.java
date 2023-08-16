package org.example.Enumy.Dodatkowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CoffeType pierwsza = CoffeType.ESPRESSO;


        List<CoffeType> kawa = new ArrayList<>(List.of(CoffeType.values()));

        kawa.stream()
                .filter(x -> x.name() == "MOCCA")
                .forEach(System.out::println);

        int count = (int) kawa.stream()
                .filter(x -> x.name() == "MOCCA")
                .count();

        System.out.println(count);

        kawa.stream()
                .map(x-> x+"s")
                .forEach(System.out::println);

        pierwsza.returnInfo();
    }



}

