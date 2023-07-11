package org.example.ZadaniaPodstawa.Task14;

import java.util.Scanner;

public class Task14b {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char first = scanner.next().charAt(0);
        char second = scanner.next().charAt(0);
        int number = 0;

        int first_int = (int) first;
        int second_int = (int) second;

        int result = first_int - second_int;

        System.out.println(Math.abs(result));

    }
}
