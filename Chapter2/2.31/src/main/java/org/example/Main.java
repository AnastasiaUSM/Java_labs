//2.31 Используя только те программные техники, которые вы изучили в этой главе,
//напишите программу, которая вычисляет квадраты и кубы чисел от 0 до 10 и
// выводит полученные значения в виде таблицы.
package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.printf("number\tsquare\tcube%n");
        System.out.printf("0\t\t%d\t\t%d%n", 0 * 0, 0 * 0 * 0);
        System.out.printf("1\t\t%d\t\t%d%n", 1 * 1, 1 * 1 * 1);
        System.out.printf("2\t\t%d\t\t%d%n", 2 * 2, 2 * 2 * 2);
        System.out.printf("3\t\t%d\t\t%d%n", 3 * 3, 3 * 3 * 3);
        System.out.printf("4\t\t%d\t\t%d%n", 4 * 4, 4 * 4 * 4);
        System.out.printf("5\t\t%d\t\t%d%n", 5 * 5, 5 * 5 * 5);
        System.out.printf("6\t\t%d\t\t%d%n", 6 * 6, 6 * 6 * 6);
        System.out.printf("7\t\t%d\t\t%d%n", 7 * 7, 7 * 7 * 7);
        System.out.printf("8\t\t%d\t\t%d%n", 8 * 8, 8 * 8 * 8);
        System.out.printf("9\t\t%d\t\t%d%n", 9 * 9, 9 * 9 * 9);
        System.out.printf("10\t\t%d\t\t%d%n", 10 * 10, 10 * 10 * 10);
    }
}