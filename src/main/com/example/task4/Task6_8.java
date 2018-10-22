package main.com.example.task4;

import java.util.Scanner;

public class Task6_8 {
    public static void main(String[] args) {
        int size = 5;
        int sample[] = new int[size];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите " + size + " чисел");
        //  заполнение массива
        for (int i = 0; i < size; i++) {
            sample[i] = scanner.nextInt();
        }
        // умножение каждого элемента массива на 2

        for (int i = 0; i < size; i++) {
            sample[i] *= 2;
        }
        // вывод массива

        for (int i = 0; i < size; i++) {
            System.out.print((sample[i]) + " ");
        }
    }
}