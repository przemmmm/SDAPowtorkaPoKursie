package org.example.Enumy.Dodatkowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        CoffeType pierwsza = CoffeType.ESPRESSO;
        CoffeType druga = CoffeType.ESPRESSO;
        CoffeType trzecia = CoffeType.CAPPUCINO;



        List<CoffeType> kawa = new ArrayList<>(List.of(CoffeType.values()));
        kawa.forEach(System.out::println);

        System.out.println("*******************");

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

        System.out.println("Sprawdzamy porownania");

        System.out.println(pierwsza==druga);
        System.out.println(pierwsza.equals(druga));

        Stream.of(CoffeType.values()).forEach(System.out::println);

        System.out.println("*********************");

        for (CoffeType value : CoffeType.values()) {
            System.out.println(value);
        }

        System.out.println(CoffeType.ESPRESSO.ordinal());

        druga.returnInfo();


    }







}

