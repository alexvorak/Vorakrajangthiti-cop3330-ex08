/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise08 {
    public static void main(String[] args) {
        System.out.printf("How many people? ");
        Scanner scanner = new Scanner(System.in);
        String people = scanner.nextLine();
        int newpeople = Integer.parseInt(people);
        System.out.printf("How many pizzas do you have? ");
        Scanner scanner1 = new Scanner(System.in);
        String totalpizzas = scanner1.nextLine();
        int total = Integer.parseInt(totalpizzas);
        System.out.printf("How many slices per pizza? ");
        Scanner scanner2 = new Scanner(System.in);
        String slices = scanner2.nextLine();
        int slicesperpizza = Integer.parseInt(slices);
        int totalslices;
        totalslices = slicesperpizza * total;
        int slicesper;
        slicesper = totalslices/newpeople;
        int remainder = totalslices%newpeople;
        System.out.printf(newpeople + " people with " + total + " pizzas (" + totalslices + " slices)");
        System.out.printf("\nEach persons gets " + slicesper + " pieces of pizza.");
        System.out.printf("\nThere are " + remainder + " leftover pieces.");
    }
}