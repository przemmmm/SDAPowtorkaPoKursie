package org.example.ZadaniaPodstawa.Task20;

import java.util.Random;
import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int liczba = random.nextInt(9);
        System.out.println(liczba);
        int wybor;

        do{
            System.out.println("Podaj swoją liczbę: ");
            wybor = scanner.nextInt();
            if(wybor>liczba) {
                System.out.println("Za dużo");
            } else if (wybor<liczba)
            {
                System.out.println("Za malo");
            } else System.out.println("Bingo!");

        }while(wybor!=liczba);




    }
}
