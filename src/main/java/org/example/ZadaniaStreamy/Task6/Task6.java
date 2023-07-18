package org.example.ZadaniaStreamy.Task6;

/*
Napisz metodę, która zwraca łańcuch rozdzielany przecinkami na podstawie podanej
listy liczb całkowitych. Każdy element powinien być poprzedzony literą „e”, jeśli liczba
jest parzysta, i poprzedzona literą „o”, jeśli liczba jest nieparzysta. Na przykład, jeśli lista
danych wejściowych to (3,44), wynikiem powinno być „o3, e44”. Użyj strumieni.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(List.of(1,2));

        List<String> lista2 = lista.stream()
                .map(x->x%2==0?"e"+x : "o"+x)  //zamianiamy argument x na argument z prefixem albu siffixem w zalenzosci od spelnienia warunku trojargumentowego "elvis"
                .collect(Collectors.toList());

        System.out.println(lista2);
    }
}

/*
public String getString(List<Integer> list) {
return list.stream()
.map(i -> i % 2 == 0 ? "e" + i : "o" + i)
.collect(Collectors.joining(","));
 */
