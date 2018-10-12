package main.com.example.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            y = scanner.nextInt();
        }
        if (scanner.hasNextInt()) {
            z = scanner.nextInt();
        }
        float avg = (x + y + z) / 3.0f;
        System.out.println(avg);
        float dev = avg / 2;
        System.out.println((int) dev);
        if (dev > 3) {
            System.out.println("Программа выполнена корректно");

        }


    }

}
