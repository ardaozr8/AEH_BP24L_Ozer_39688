package pl.pp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile;
        File outputFile;

        while (true) {
            try {
                System.out.print("Enter input file path: ");
                String inputPath = scanner.nextLine();
                inputFile = new File(inputPath);
                if (!inputFile.exists()) {
                    throw new IOException("File does not exist.");
                }
                break;
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage() + " Please try again.");
            }
        }

        System.out.print("Enter output file path: ");
        String outputPath = scanner.nextLine();
        outputFile = new File(outputPath);

        int lineCount = 0;
        try (Scanner fileScanner = new Scanner(inputFile)) {
            while (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
                lineCount++;
            }

            System.out.println("Number of lines: " + lineCount);

            try (FileWriter writer = new FileWriter(outputFile)) {
                writer.write("Input file name: " + inputFile.getName() + "\n");
                writer.write("Number of lines: " + lineCount + "\n");
                System.out.println("Result written to: " + outputPath);
            }

        } catch (IOException e) {
            System.out.println("Error processing files: " + e.getMessage());
        }
    }
}
