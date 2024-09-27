//2.17 Напишите программу, которая вводит три целых числа от пользователя и отображает
//их сумму, среднее значение, произведение, наименьшее и наибольшее из чисел. Используйте
//техники, показанные на рис. 2.15. [Примечание: при вычислении среднего значения в этом
//упражнении должно получаться целочисленное представление среднего. То есть, если сумма значений равна 7, среднее значение должно быть 2, а не 2.3
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum/3;
        int product = num1 * num2 * num3;


        int smallest = num1;
        if (num2 < smallest) {
            smallest = num2;
        }
        if (num3 < smallest) {
            smallest = num3;
        }

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        // Выводим результаты
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        input.close();
    }
}

