//Один интересный способ использования компьютеров — это отображение графиков и
//столбчатых диаграмм. Напишите программу, которая считывает пять чисел от 1 до 30.
//Для каждого введённого числа программа должна отобразить соответствующее количество
//соседних звездочек. Например, если программа считывает число 7, она должна отобразить
//7 звездочек (******). Столбики из звездочек должны быть выведены после того, как будут
//введены все пять чисел.
import java.util.Scanner;
public class ChartPrinting {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Введите пять чисел от 1 до 30:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
            if (arr[i] < 1 || arr[i] > 30) {
                System.err.println("Некорректный ввод");
                i--;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < arr[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}