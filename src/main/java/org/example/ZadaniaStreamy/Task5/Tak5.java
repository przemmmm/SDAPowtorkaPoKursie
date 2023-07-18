package org.example.ZadaniaStreamy.Task5;

/*
Mając listę stringów, napisz metodę, która zwraca listę wszystkich ciągów zaczynających
się na literę „a” (małe litery) i zawierających dokładnie 3 litery, użyj strumieni.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Tak5 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("A", "ala", "bok", "adam", "Ala"));

        List<String> lista2 = lista.stream()
                .filter(x->x.startsWith("a"))  //pierwszy filtr po wielkosci litery. Pamietac o skrinie z discorda z 18.07 - Predicate T->boolean
                .filter(x->x.length()==3)      //drugi filtr po wielkosci dlugosci. Pamietac o skrinie z discorda z 18.07 - Predicate T->boolean
                .collect(Collectors.toList());

        System.out.println(lista2);


        //map sluzy do mapowania, czyli np. rzucania jednego typu na drugi, zmiany wielkosc itp. itd. Czyli na wyjsciu mamy tyle elementow ile na wejsciu
        //filter sluzy do "przesiewania" po danym warunku

    }
}

// a poniżej rozwiązanie z odpowiedzi do zadań
/*
public List<String> search(List<String> list) {
return list.stream()
.filter(s -> s.startsWith("a"))
.filter(s -> s.length() == 3)
.collect(Collectors.toList());

 */
