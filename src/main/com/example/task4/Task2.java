package main.com.example.task4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] unsortedArray = {7, 12, 99, 20, 33, 1, 2};
        System.out.println(Arrays.toString(unsortedArray));
        bubleSort(unsortedArray);
    }

    public static void bubleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;

                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}



