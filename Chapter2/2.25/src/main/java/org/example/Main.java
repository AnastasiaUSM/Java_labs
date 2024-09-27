//2.25 Напишите программу, которая считывает целое число и определяет, является ли оно четным или нечетным.
package org.example;
import java.util.Scanner;

public class Main
 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

        input.close();
    }
}
