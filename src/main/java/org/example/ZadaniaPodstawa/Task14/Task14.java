package org.example.ZadaniaPodstawa.Task14;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        int number = 0;

        for (char i = first; i<second; i++){
            number++;
        }

        System.out.println(number);

    }
}
