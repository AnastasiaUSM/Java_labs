//2.30 Напишите программу, которая запрашивает у пользователя одно число,
//состоящее из пяти цифр, разделяет число на отдельные цифры и выводит цифры,
//разделенные тремя пробелами.
package org.example;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;
        int first_digit;
        int second_digit;
        int third_digit;
        int fourth_digit;
        int five_digit;

        System.out.print("Enter the 5-digits integer: ");
        num = input.nextInt();

        int digit1 = num / 10000;
        int digit2 = (num / 1000) % 10;
        int digit3 = (num / 100) % 10;
        int digit4 = (num / 10) % 10;
        int digit5 = num % 10;

        System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);

        input.close();
    }
}