package org.example.ZadaniaPodstawa.Task20;

import java.util.Random;
import java.util.Scanner;

//Napisz program, który będzie z Tobą grał w „za dużo, za mało”.
// Na początku komputer losuje liczbę z zakresu od 0 do 100 (podpowiedź: skorzystaj z metody Random.nextInt())
// a następnie czeka na podanie liczby przez użytkownika. Jeśli użytkownik poda liczbę większą,
// niż wylosowana przez komputer, program powinien wypisać „za dużo” i czekać na podanie kolejnej liczby.
// Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „za mało” i analogicznie czekać na następną liczbę.
// Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!” i zakończyć się

public class Task20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int liczba = random.nextInt(101);
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
