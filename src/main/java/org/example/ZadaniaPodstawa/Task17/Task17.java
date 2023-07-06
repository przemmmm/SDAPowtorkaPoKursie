package org.example.ZadaniaPodstawa.Task17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;

//Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i
// obliczy ile dni do nich pozostało. Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate.
// Obecną datę pobierz z metody LocalDate.now().

public class Task17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date zajec w formacie RRRR-MM-DD");

        String data = scanner.nextLine();

        LocalDate courseDate = LocalDate.parse(data, DateTimeFormatter.ISO_DATE);

        LocalDate todaDate = LocalDate.now();

        long daysToCourse = ChronoUnit.DAYS.between(todaDate, courseDate);

        System.out.println("Dni do kursu: " + daysToCourse);

    }

}
