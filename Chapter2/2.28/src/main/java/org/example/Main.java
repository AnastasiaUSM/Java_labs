//2.28 Напишите программу, которая запрашивает у пользователя радиус круга как целое число
// и выводит диаметр, окружность и площадь круга, используя значение 3.14159 для π.
package org.example;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        System.out.printf("Diameter: %d%n", 2 * radius);//2r
        System.out.printf("Circumference: %.2f%n", 2 * Math.PI * radius);//2πr
        System.out.printf("Area: %.2f%n", Math.PI * radius * radius);//πr²

        input.close();
    }
}
