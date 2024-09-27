//2.26 (Кратные числа) Напишите программу, которая считывает два целых числа, определяет,
//является ли первое кратным второму, и выводит результат.
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();

        if (num2 != 0) {
            if (num1 % num2 == 0) {
                System.out.println(num1 + " is a multiple of " + num2 + ".");
            } else {
                System.out.println(num1 + " is not a multiple of " + num2 + ".");
            }
        } else {
            System.out.println("The second number cannot be zero.");
        }

        input.close();
    }
}