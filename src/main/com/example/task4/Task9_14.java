package main.com.example.task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task9_14 {
    public static void main(String[] args) {
        int[] unsortedArray ={6,11,5,9,1,3,7};
        System.out.println(Arrays.toString(unsortedArray));
        bubleSort (unsortedArray);
    }

  public static void bubleSort(int[] arrayToSort)
    // проходим по массиву
    // находим min элемент
    // повторяем пока не пройдем по всему массиву

    {
        int changeCounter = arrayToSort.length;
        do {

            for (int index = 0; index < changeCounter - 1; index++) {
                if (arrayToSort[index] > arrayToSort[index + 1]) {
                    int temp = arrayToSort[index];
                    arrayToSort[index] = arrayToSort[index + 1];
                    arrayToSort[index + 1] = temp;
                }
            }
            changeCounter--;
        } while (changeCounter > 0);
        System.out.println(Arrays.toString(arrayToSort));

    }

}
