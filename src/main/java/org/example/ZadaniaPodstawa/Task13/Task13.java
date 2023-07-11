package org.example.ZadaniaPodstawa.Task13;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int counter = scanner.nextInt();

        String[] exploded = text.split(" ");

        for (int i = 0; i <exploded.length ; i++) {
            for (int j = 0; j < counter; j++) {
                System.out.print(exploded[i] + " ");
            }
        }
    }
}
