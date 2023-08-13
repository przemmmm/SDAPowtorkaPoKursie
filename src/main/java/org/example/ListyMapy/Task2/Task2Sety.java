package org.example.ListyMapy.Task2;

/*

•	Przechowuje unikalne elementy – bez powtórzeń;
•	Korzysta tylko z metod interfejsu collection;

* HashSet
    -kolejność elementów nie jest zachowana
    -przechowuje informacje w tablicy hashującej

* TreeSet
      -kolejność elementów jest zachowana według tzw. kolejności naturalnej lub wg pewnego Comparatora
      -przechowuje dane w drzewie czerwono-czarnym

* LinkedHashSet
	-zachowuje informację o kolejności dodawania poszczególnych elementów
    -implementacja jest oparta o tablicę hashującą, wraz z obsługą linked list


names.add("John")	                            dodaje nowy element do danego zbioru;
if (names.contains("John"))                 	weryfikuje, czy w danym zbiorze znajduje się dany element i zwraca false lub true
numbersSet.isEmpty()	                        sprawdza, czy zbiór numberSet jest pusty  i zwraca false lub true
numbersSet.forEach(System.out::println);	    wyświetla zbiór numberSet


 */

import java.util.*;
import java.util.stream.Collectors;

public class Task2Sety {

    public static void main(String[] args) {

        Set<Integer> zbior = new LinkedHashSet<>(List.of(3,2,3));

        zbior.forEach(System.out::println);

       Set<Integer> zbior2 =  zbior.stream()
                .map(x->x+1)
                .collect(Collectors.toSet());

        zbior2.forEach(System.out::println);

    }


}
