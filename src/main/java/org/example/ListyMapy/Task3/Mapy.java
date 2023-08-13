package org.example.ListyMapy.Task3;

/*
Interfejs java.util.Map jest strukturą danych, umożliwiającą operowanie na danych w postaci klucz-wartość.
Każdy klucz w takim obiekcie musi być unikalny, tzn. jeden klucz może zawierać dokładnie jedną wartość.

Map <String, Float> employees = new HashMap<>();  --> nowa instancja
Pierwszy argument to klucz /  key
Drugi argument to wartość /  value

HashMap
•	kolejność par nie jest zachowana
•	przechowuje informacje w tablicy hashującej.

TreeMap
•	kolejność par jest zachowana według tzw. kolejności naturalnej kluczy lub wg pewnego Comparatora kluczy
•	przechowuje dane w drzewie czerwono-czarnym

LinkedHashMap
•	zachowuje informację o kolejności dodawania poszczególnych par
•	implementacja jest oparta o tablicę hashującą, wraz z obsługą linked list

put	            służy do dodania odpowiedniej pary do kolekcji lub zastąpienia starej wartości nową dla konkretnego klucza
get	            służy do pobierania wartości na podstawie klucza
remove	        usuwa element na podstawie klucza (lub dodatkowo wartości)
containsKey	    zwraca informację, czy istnieje wartość w mapie dla danego klucza
containsValue	zwraca informację, czy istnieje klucz w mapie dla danej wartości
size	        zwraca ilość par (tzw. Entry) znajdujących się w kolekcji
isEmpty	        zwraca informację, czy mapa jest pusta
keySet  	    zwraca zbiór kluczy jako Set
values	        zwraca wszystkie wartości jako Collection
entrySet	    zwraca Set obiektów klucz-wartość. Pojedyncza para jest reprezentowana przez klasę wewnętrzną Map.Entry.



 */

import java.util.HashMap;
import java.util.Map;

public class Mapy {

    public static void main(String[] args) {

        Map<String, Double> employeesAndSalary = new HashMap<>();

        employeesAndSalary.put("Kowalski", 5000.0);
        employeesAndSalary.put("Nowak", 3000.0);
        employeesAndSalary.put("Smith", 7000.0);

        System.out.println("Wyswietlanie pelnej lsty");  //nie mozna wyswietlic metoda forEach

        System.out.println("Wyswietlamy klucze: ");  //tu wyswietlamy sobie po kluczach
        for (String key : employeesAndSalary.keySet()) {
            System.out.println("Klucz: " + key);

        }

        System.out.println("Wyswietlamy klucze: ");  //tu wyswietlamy sobie po wartosciac
        for (Double value : employeesAndSalary.values()) {
            System.out.println("Wartość: " + value);

        }

        System.out.println("Wyswietlanie po parach: ");  // tu wyswietlamy po parach klucz - wartośc dzięki klasie Map.entry
        /*
        Jelsi chcemy wyswietlic zestaw wartoisc i kluczy to musimy robić to metodą jak ponizej. Czyli korzystamy z Map.Entry. Inaczej nie przejdzie

         */

        for (Map.Entry<String, Double> element  : employeesAndSalary.entrySet()) {
            System.out.println("Klucz: " + element.getKey()+ ". Wartość: " + element.getValue());
            
        }

        
    }
}
