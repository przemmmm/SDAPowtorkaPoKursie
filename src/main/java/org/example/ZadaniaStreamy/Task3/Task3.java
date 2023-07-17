package org.example.ZadaniaStreamy.Task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>(List.of(1,2,3,4,5));


        System.out.println(meanValue(lista));

    }

    public static double meanValue(List<Integer> lista){
        return lista.stream()
                .mapToInt(x->x)
                .average()
                .getAsDouble();
    }
}
