//2.24 (Наибольшие и наименьшие целые числа) Напишите программу,
//которая считывает пять целых чисел и определяет, а затем выводит
//наибольшее и наименьшее целое число в группе. Используйте только
//те программные техники, которые вы изучили в этой главе.

package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        int smallest = 0;
        int largest = 0;

        System.out.print("Enter first integer: ");
        num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        num2 = input.nextInt();

        if (num1 > num2) {
            largest = num1;
            smallest = num2;
        }
        if (num2 >= num1) {
            largest = num2;
            smallest = num1;
        }

        System.out.print("Enter third integer: ");
        num3 = input.nextInt();

        if (num3 > largest)
            largest = num3;
        if (num3 <= smallest)
            smallest = num3;

        System.out.print("Enter fourth integer: ");
        num4 = input.nextInt();

        if (num4 > largest)
            largest = num4;
        if (num4 <= smallest)
            smallest = num4;

        System.out.print("Enter fifth integer: ");
        num5 = input.nextInt();

        if (num5 > largest)
            largest = num5;
        if (num5 <= smallest)
            smallest = num5;

        System.out.printf("The smallest is: %d%n", smallest);
        System.out.printf("The largest is: %d%n", largest);
    }
}