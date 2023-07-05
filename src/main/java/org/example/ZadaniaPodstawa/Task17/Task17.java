package org.example.ZadaniaPodstawa.Task17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import static java.time.format.DateTimeFormatter.ofLocalizedDate;

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
