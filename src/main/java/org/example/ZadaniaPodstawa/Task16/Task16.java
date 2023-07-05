package org.example.ZadaniaPodstawa.Task16;

import java.util.Scanner;

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
        for (int i : liczby) {
            if(i>currentBiggest)
            {
                currentBiggest=i;
                counter++;
                // tu musze dodać jeszcze dodatkowa zmienna "Longest strike". I teraz z kazdym tazem, jak kolejna liczba będzie mniejsza będe musial sprawdzac
                // czy counter jest teraz wiekszy czy mniejszy. w skrocie - musze gdzies zapisywac najiekszy doychczas łanuch
            } else
            {
                counter =0;
            }

        }
        System.out.println(counter);
    }


}
