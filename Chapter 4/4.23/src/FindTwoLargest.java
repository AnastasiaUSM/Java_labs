//Используя подход, аналогичный заданию 4.21, найдите два наибольших значения из 10
// введённых чисел. [Примечание: Вы можете вводить каждое число только один раз.]
import java.util.Scanner;

public class FindTwoLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int largest = Integer.MIN_VALUE; // Наибольшее число
        int secondLargest = Integer.MIN_VALUE; // Второе наибольшее число

        System.out.println("Введите 10 чисел:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Число " + i + ": ");
            int number = scanner.nextInt();

            if (number > largest) {
                secondLargest = largest; // Текущее наибольшее становится вторым
                largest = number;        // Новое наибольшее
            } else if (number > secondLargest) {
                secondLargest = number;  // Обновляем второе наибольшее
            }
        }

        System.out.println("Наибольшее число: " + largest);
        System.out.println("Второе наибольшее число: " + secondLargest);
    }
}
