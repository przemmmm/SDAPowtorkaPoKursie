package org.example.ZadaniaPodstawa.Task10;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

       int counter=0;

       do{
           counter = counter + liczba%10;
           liczba=liczba/10;

       }while(liczba!=0);

        System.out.println(counter);

    }
}
