package org.example.ZadaniaStreamy.PowtorkaStreamy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Boardgames> games = new ArrayList<>(List.of(
                new Boardgames("Katan", 120.0, 4, Type.ECONOMY),
                new Boardgames("Talizman", 360.0, 2, Type.ADVENTURE),
                new Boardgames("Monopoly", 100.0, 4, Type.ECONOMY),
                new Boardgames("Memory", 50.0, 1, Type.FAMILY)
        ));

        games.stream()
                .filter(g->g.getPrice()>50)  // każde wywowalnie metody filter tworzy nową instancje klasy Stream
                .filter(g->g.getType().equals(Type.ECONOMY))
                .map(g->g.name.toUpperCase())
                .collect(Collectors.toList());
               // .forEach(System.out::println);
    }


    //filter - nie tworzy nowgo struienia, tylko filtruje
    //map - pobiera dana, zmienia ja i tworzy nowy strumień


}
