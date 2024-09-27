//2.32 Напишите программу, которая запрашивает ввод пяти чисел и определяет,
//а затем выводит количество введенных отрицательных чисел, количество
//введенных положительных чисел и количество введенных нулей.
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        System.out.print("Enter the fourth number: ");
        int num4 = input.nextInt();

        System.out.print("Enter the fifth number: ");
        int num5 = input.nextInt();

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        // Проверка первого числа
        if (num1 < 0) {
            negativeCount++;
        } else if (num1 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        // Проверка второго числа
        if (num2 < 0) {
            negativeCount++;
        } else if (num2 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        // Проверка третьего числа
        if (num3 < 0) {
            negativeCount++;
        } else if (num3 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        // Проверка четвертого числа
        if (num4 < 0) {
            negativeCount++;
        } else if (num4 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        // Проверка пятого числа
        if (num5 < 0) {
            negativeCount++;
        } else if (num5 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        // Вывод результатов
        System.out.printf("Negative numbers: %d%n", negativeCount);
        System.out.printf("Positive numbers: %d%n", positiveCount);
        System.out.printf("Zeros: %d%n", zeroCount);

        input.close();
    }
}
