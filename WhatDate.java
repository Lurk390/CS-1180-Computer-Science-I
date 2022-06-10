import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WhatDate {
    public static void main(String[] args) {
        LocalDate todaysDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate = todaysDate.format(formatter);
        System.out.println("Todays date is " + formattedDate);

        Scanner input = new Scanner(System.in);
        System.out.print("How many days would you like to add? ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            input.next();
        }

        int daysToAdd = input.nextInt();
        LocalDate futureDate = LocalDate.now().plusDays(daysToAdd);
        String formattedFutureDate = futureDate.format(formatter);
        System.out.println("The new date is " + formattedFutureDate);
        input.close();
    }
}
