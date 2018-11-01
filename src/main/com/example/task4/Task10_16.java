package main.com.example.task4;

import java.io.FileWriter;
import java.util.Scanner;

public class Task10_16 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("notes5.txt")) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            writer.write(input);
        } catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
