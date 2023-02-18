/**
 *  Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
 */
package org.example.seminar2.hw3;

import java.util.Arrays;

public class hw3 {
    public static void main(String[] args) {
        int[] array = {11, -21, 31, 42, -51, 61, 73, -82, 19};
        replaceNegativeNumbers(array);
        System.out.println(Arrays.toString(array));
    }

    public static void replaceNegativeNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                sum += i;
            } else if (array[i] < 0) {
                array[i] = sum;
            }
        }
    }
}


