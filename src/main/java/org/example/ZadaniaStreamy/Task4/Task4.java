package org.example.ZadaniaStreamy.Task4;

//Napisz metodę, która konwertuje wszystkie ciągi z listy na wielkie litery za pomocą
//        strumieni.

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("a", "b", "cdrw"));

        System.out.println(lista2(lista));
    }

    public static List<String> lista2 (List<String> lista){
        return lista.stream()
                .map(String::toUpperCase)
                .toList();

    }

}
