package pl.pp;

import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age in years:");
        int ageYears = scanner.nextInt();

        long ageInSeconds = (long) ageYears * 365 * 24 * 60 * 60;

        System.out.println("My age in seconds: " + ageInSeconds);



    }
}


