/**
 * Дана последовательность N целых чисел. Найти сумму простых чисел.
 */
package org.example.seminar2.hw1;

import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        scanner.close();

        int sum = 0;
        for (int num : numbers) {
            if (isPrime(num)) {
                sum += num;
            }
        }

        System.out.println("Сумма простых чисел равна: " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}