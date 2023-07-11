package org.example.ZadaniaPodstawa.Task12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int textLength = text.length();

        float procent;

        String textBezSpacji =text.replaceAll(" ", "");
        int textBezSpacjiLength = textBezSpacji.length();

        procent = 100*(textLength-textBezSpacjiLength)/textLength;

        System.out.println(procent + "%");

    }
}
