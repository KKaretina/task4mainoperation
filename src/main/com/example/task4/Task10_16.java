package main.com.example.task4;

import java.io.FileWriter;
import java.util.Scanner;

public class Task10_16 {

    private static final String STOP_WORD = "stop";

    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter(Task10_16.class.getSimpleName() + ".txt")) {
            Scanner scanner = new Scanner(System.in);
            String input;
            while (!STOP_WORD.equals(input = scanner.next())) {
                writer.write(input + "\n");
            }
        } catch (java.io.IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
