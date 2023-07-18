package org.example.ZadaniaStreamy.Task1;

import java.util.Scanner;

//Odwróć liczbę za pomocą pętli while.
//        Program poprosi użytkownika o wprowadzenie numeru, a następnie odwróci liczbę za
//        pomocą pętli while.


public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Long liczba = scanner.nextLong();

        String liczbaString = liczba.toString();
        char[] liczbaChar = liczbaString.toCharArray();
        char[] reversedLiczba = new char[liczbaChar.length];

        int counter = liczbaChar.length;
        int reverseCounter = 0;

        while(counter!=0){

            reversedLiczba[reverseCounter]=liczbaChar[counter-1];
            reverseCounter++;
            counter--;
        }

        int number = Integer.parseInt(new String(reversedLiczba));  // po odwroceniu tablicy rzutujemy ja na int, żeby moc wykonywac operacje na odwroconej liczbie
        System.out.println(number);

        int nowaLiczba = number +2;
        System.out.println(nowaLiczba);



    }
}
