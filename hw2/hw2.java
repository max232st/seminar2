/**
 * Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
 */
package org.example.seminar2.hw2;

import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        int n = scanner.nextInt();

        boolean isIncreasing = true;
        int prev = scanner.nextInt();

        for (int i = 1; i < n; i++) {
            int curr = scanner.nextInt();
            if (curr < prev) {
                isIncreasing = false;
                break;
            }
            prev = curr;
        }

        System.out.println(isIncreasing ? "Последовательность является возрастающей" : "Не возрастающая последовательность");
    }
}
