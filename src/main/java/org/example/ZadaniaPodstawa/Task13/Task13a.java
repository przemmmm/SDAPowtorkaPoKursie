package org.example.ZadaniaPodstawa.Task13;

import java.util.Scanner;

public class Task13a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int counter = scanner.nextInt();

        repeat(text, counter);
    }
    public static void repeat(String text, int counter){

        String[] exploded = text.split(" ");

        for (int i = 0; i <exploded.length ; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(exploded[i] + " ");
            }
        }
    }

}
