//Создайте Java-приложение, которое вычисляет валовую заработную плату
//(общую сумму денег до вычета налогов и тд) для каждого из трех сотрудников.
//Компания платит стандартную ставку за первые 40 часов работы и полуторную ставку за часы,
//превышающие 40. Программа должна принимать на вход количество отработанных часов за
//прошлую неделю и почасовую ставку каждого сотрудника, а затем вычислять и выводить валовую заработную плату.
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        // Создаем объект Scanner для ввода данных
        Scanner scanner = new Scanner(System.in);

        // количество сотрудников
        final int Employees = 3;

        double hoursWorked, hourlyRate, grossPay;

        // обработка данных каждого сотрудника
        for (int i = 1; i <= Employees; i++) {
            System.out.println("Введите данные для сотрудника #" + i);

            // отработанные часы
            System.out.print("Количество отработанных часов: ");
            hoursWorked = scanner.nextDouble();

            // почасовая ставка
            System.out.print("Почасовая ставка: ");
            hourlyRate = scanner.nextDouble();

            // валовая заработная плата
            if (hoursWorked <= 40) {
                grossPay = hoursWorked * hourlyRate;
            } else {
                double overtimeHours = hoursWorked - 40;
                grossPay = (40 * hourlyRate) + (overtimeHours * hourlyRate * 1.5);
            }

            // Вывод результата
            System.out.printf("Валовая заработная плата сотрудника #%d: %.2f%n", i, grossPay);
        }
        scanner.close();
    }
}
