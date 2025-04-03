package pl.pp;

import java.util.Scanner;

public class myFourthApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower, upper;

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            lower = scanner.nextInt();
            upper = scanner.nextInt();

            if (upper <= lower) {
                System.out.println("Done");
                break;
            }

            int sum = 0;
            for (int i = lower; i <= upper; i++) {
                sum += i * i;
            }

            System.out.println("The sums of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + sum);
        }
    }
}
