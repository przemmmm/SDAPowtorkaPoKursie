package org.example.ZadaniaPodstawa.Task10;

import java.util.Scanner;

public class Task10b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        System.out.println(SumUpDigitsOfNumber(liczba));

    }

    public static int SumUpDigitsOfNumber (int number){
        int counter=0;

        do{
            counter = counter + number%10;
            number=number/10;

        }while(number!=0);

        return counter;
    }
}
