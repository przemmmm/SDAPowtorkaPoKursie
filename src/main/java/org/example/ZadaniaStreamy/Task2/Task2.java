package org.example.ZadaniaStreamy.Task2;

//Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
//        odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
//        sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy: ");
        int size = scanner.nextInt();

        int[] table = new int[size];

        for (int i = 0; i < size; i++) {
            table[i] = scanner.nextInt();   //przypisanie wczytanej liczby do kolejnych miejsc w tabell "table"
        }

        //sortowanie bąbelkowe

        for (int j = 0; j < table.length - 1; j++) {
            for (int i = 1; i < table.length; i++) {
                int auxnumber; //zmienna pomocnicza
                if (table[i] > table[i-1]) {
                    auxnumber = table[i];
                    table[i] = table[i-1];
                    table[i-1] = auxnumber;
                }

            }

            }
        System.out.println("Po babelkowaniu: ");
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i]);

        }
    }
}
