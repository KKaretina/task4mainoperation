package main.com.example.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];


        System.out.println("Введите элемента, " + size + " штук");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");

        }
            Arrays.sort(array);
            System.out.println();

            for (int i = 0; i < size; i++) {


                System.out.println(array[i] + " ");
            }
        }


    }






