package main.com.example.task4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        int x = 0;
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            x = scanner.nextInt();
        }
        System.out.println(x);
    }
}
