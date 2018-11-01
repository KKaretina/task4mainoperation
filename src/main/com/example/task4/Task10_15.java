package main.com.example.task4;

import java.io.FileReader;

public class Task10_15 {
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
    }
}