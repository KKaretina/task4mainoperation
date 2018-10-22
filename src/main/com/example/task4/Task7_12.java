package main.com.example.task4;

import java.util.Scanner;

public class Task7_12 {
    public static void main(String[] args) {

        String x;
        String y;
        Scanner scanner = new Scanner(System.in);


        x = scanner.nextLine();
        y = scanner.nextLine();
        // сравнение длины двух строк

        if (x.length() > y.length()) {
            System.out.println(x);

        } else {
            System.out.println(y);
        }
    }
}
