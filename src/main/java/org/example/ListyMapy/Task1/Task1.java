package org.example.ListyMapy.Task1;

import java.util.ArrayList;
import java.util.List;

/*

java.util.List jest interfejsem, który reprezentuje kolekcje uporządkowane. Charakteryzuje się tym, że:
•	może zawierać zduplikowane elementy (tzn. o takiej samej wartości)
•	element możemy pobrać na podstawie jego pozycji w liście (na podstawie indeksu)
•	element możemy wyszukać.


METODA	CO ROBI
surnames.add("Nowak")	                    dodaje nowy element do danej listy
surnames.add(0, "Nowak")	                dodaje nowy element we wskazanym punkcie.
surnames.forEach(System.out::println);	    wyswietla daną listę


 */

public class Task1 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();

        lista.forEach(System.out::println);

        addItem(lista, 6);

        System.out.println("po zmianach");
        lista.forEach(System.out::println);

        System.out.println(lista.size());


        addItem(lista, 3);
        lista.forEach(System.out::println);
        System.out.println(lista.size());

        addItemIfLength(lista, 7);

        System.out.println("Po indeksie: ");

        try{
            System.out.println(lista.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Wybrales indeks spoza listy!");
        }

        for (Integer integer : lista) {
            System.out.println(integer + " iterem");

        }

    }

    public static List<Integer> addItem(List<Integer> lista, int addedItem){

        if(lista.contains(addedItem)){
            return lista;
        } else lista.add(addedItem);

        return lista;
    }

    public static void addItemIfLength(List<Integer> lista, int addItem){
        if(lista.size()>=5){
            lista.add(addItem);
            System.out.println("Dodano element");
        }else System.out.println("Lista jest za krotka, bo zawiera tylko " + lista.size() + " elementow!");
    }

}
