package main.com.example.task4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущий курс ");
        float charge = scanner.nextFloat();

        System.out.println("Введите количество рублей ");
        float rub = scanner.nextFloat();

        float course = (rub / charge);
        System.out.print(rub + " рублей вы можете обменять на " + course + " долларов");
    }
}