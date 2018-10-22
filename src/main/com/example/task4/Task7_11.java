package main.com.example.task4;

import java.util.Scanner;

public class Task7_11 {
    public static void main(String[] args) {

        String x;
        String y;
        Scanner scanner = new Scanner(System.in);

        x = scanner.nextLine();
        // отсев пробелов
        y = x.replace(" ", "");
        System.out.println(y);
    }
}
