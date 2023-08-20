package org.example.Enumy.Task1;

public class Task1 {

    public static void main(String[] args) {
        Weekday day = Weekday.MONDAY;
        Weekday day2 = Weekday.FRIDAY;

        System.out.println(day.isWeekDay());

       day2.whichIsGreater(Weekday.FRIDAY);
       day2.whichIsGreater(Weekday.SUNDAY);
       day2.whichIsGreater(Weekday.WEDNESDAY);

    }
}
