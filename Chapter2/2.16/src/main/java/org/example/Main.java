//2.16Напишите программу, которая запрашивает у пользователя ввод двух целых чисел,
//получает их от пользователя и отображает большее число, за которым следуют
//слова "больше". Если числа равны, выведите сообщение "Эти числа равны".
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2) {
            System.out.printf("%d is larger%n", num1);
        } else if (num1 < num2) {
            System.out.printf("%d is larger%n", num2);
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}
