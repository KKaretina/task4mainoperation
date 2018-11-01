package main.com.example.task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Task10_17 {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("notes5.txt")) {
            // читаем посимвольно
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileWriter writer = new FileWriter("notes5.txt", false)) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            writer.write(input);
        } catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


