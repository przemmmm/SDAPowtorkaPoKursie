package org.example.ZadaniaPodstawa.Task11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String theLongestText = "";
        String text;

        while (true) {
            text = scanner.nextLine();
            if (text.equals("Starczy")) {
                break;
            }
            if (text.length() > theLongestText.length()) {
                theLongestText = text;
            }
        }

        if (theLongestText.isEmpty()) {
            System.out.println("Nie podano żadnego tekstu.");
        } else {
            System.out.println("Najdłuższy tekst: " + theLongestText);
        }
    }
}