//2.15 Напишите программу, которая запрашивает у пользователя ввод двух целых чисел,
//получает их от пользователя и выводит их сумму, произведение, разность и частное (деление).
package org.example;
import java.util.Scanner;//Для считывания ввода пользователя

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;

        int sum;
        int product;
        int difference;
        double division;

        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        sum = num1 + num2;
        product = num1 * num2;
        difference = num1 - num2;
        division = (double) num1 / num2;

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Difference: %d%n", difference);
        System.out.printf("Quotient: %.2f%n", division);
    }
}