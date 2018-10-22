package main.com.example.task4;

import java.util.Scanner;

public class Task8_13 {
    public static void main(String[] args) {

        int x;
        String s;
        double y;
        Scanner scanner = new Scanner(System.in);

        s = scanner.nextLine();
        // конвертация строковой переменной S в числовую переменную X
        x = Integer.parseInt(s);
        //  Конвертация числа X типа int в число Y типа double
        y = x;

        System.out.println(s);
        System.out.println(x);
        System.out.println(y);

    }
}
