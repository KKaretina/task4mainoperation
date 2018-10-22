package main.com.example.task4;

import java.util.Scanner;

public class task6_9 {
    public static void main(String[] args) {
        int size = 3;
        int sample[][] = new int[size][size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите " + size * size + " чисел");
        // заполнение матрицы
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sample[i][j] = scanner.nextInt();
            }
        }
        // каждый элемент первой строки умножается на 3

        for (int i = 0; i < size; i++) {
                sample[0][i] *= 3;
        }
        // вывод первой строки матрицы

        for (int i = 0; i < size; i++) {
            System.out.print((sample[0][i]) + " ");
        }
    }
}