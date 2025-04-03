package pl.pp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        runCalculatorProgram();  // Sadece Task 2 çalışır
    }

    public static void runCalculatorProgram() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        while (true) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("a - Add");
            System.out.println("s - Subtract");
            System.out.println("m - Multiply");
            System.out.println("d - Divide");
            System.out.println("q - Quit");
            System.out.print("Choose an option: ");
            choice = scanner.next();

            if (choice.equals("q")) {
                System.out.println("Exiting calculator...");
                break;
            }

            double num1 = 0, num2 = 0;
            boolean validInput = false;

            while (!validInput) {
                try {
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                    scanner.nextLine(); // hatalı satırı temizle
                }
            }

            switch (choice) {
                case "a":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "s":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "m":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "d":
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid option. Please choose a, s, m, d, or q.");
            }
        }
    }
}
