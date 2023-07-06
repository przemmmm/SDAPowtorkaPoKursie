package org.example.ZadaniaPodstawa.Task15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = scanner.nextInt();

        }

        int[] nowa = new int[10];



        for (int i = 1; i <numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if(i!=j && numbers[i]==numbers[j])
                {
                   nowa[i]=numbers[i];
                    } else {nowa[i]=Integer.MIN_VALUE;

                }
            }

        }
        for (int i : nowa) {
            System.out.println(i);
        }

        }


    }

