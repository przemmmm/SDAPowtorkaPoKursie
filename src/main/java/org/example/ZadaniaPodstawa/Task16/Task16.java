package org.example.ZadaniaPodstawa.Task16;

import java.util.Scanner;

//Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int) i
// wypisze długość najdłuższego takiego podciągu tych liczb, który jest rosnący.
// Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7” program powinien wypisać „5”
// jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 10 liczb: ");
        int[] liczby = new int[10];

        for (int i = 0; i < liczby.length; i++)
        {
            liczby[i] = scanner.nextInt();
        }

        int currentBiggest= liczby[0];
        int counter = 1;
        int currentLongest=1;
        //for (int i : liczby)
            for (int i = 1; i < liczby.length ; i++) {
            if(liczby[i]>currentBiggest)
             {
                currentBiggest=liczby[i];
                counter++;
                if(counter>currentLongest)
                {
                    currentLongest=counter;
                }
            } else
            {
                counter =1;
                currentBiggest=liczby[i];
            }
        }
        System.out.println(currentLongest);
    }

}
