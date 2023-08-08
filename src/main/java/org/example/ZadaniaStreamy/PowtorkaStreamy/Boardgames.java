package org.example.ZadaniaStreamy.PowtorkaStreamy;

public class Boardgames {

    public final String name;
    public final Double price;
    public final int players;
    public final Type type;

    public Boardgames(String name, Double price, int players, Type type) {
        this.name = name;
        this.price = price;
        this.players = players;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public int getPlayers() {
        return players;
    }

    public Type getType() {
        return type;
    }
}
