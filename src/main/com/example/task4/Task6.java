package main.com.example.task4;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Введите x,y или z");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        switch (input.charAt(0)) {
            case 'x':
                System.out.println("Вы ввели x");
                break;
            case 'y':
                System.out.println("Вы ввели y");
                break;
            case 'z':
                System.out.println("Вы ввели z");
                break;
            default:
                System.out.println("Вы ввели неправильное число");
        }
    }
}