package main.com.example.task4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int enteredNumber=0;
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            enteredNumber = scanner.nextInt();
                    }
        for (int x = 1; x < 11; x++) {
            int result = x * enteredNumber;
            System.out.println(enteredNumber + "*" + x + "=" + result);
        }
    }
}
