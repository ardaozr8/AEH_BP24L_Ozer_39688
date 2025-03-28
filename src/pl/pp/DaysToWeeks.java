package pl.pp;

import java.util.Scanner;

public class DaysToWeeks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        while (true) {
            System.out.print("Enter number of days (0 or negative to exit): ");
            days = scanner.nextInt();
            if (days <= 0) {
                System.out.println("Exiting...");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days");
        }

        scanner.close();
    }
}

