//3.11 Модифицируйте класс Account, чтобы добавить метод под названием withdraw, который будет снимать деньги с аккаунта.
// Убедитесь, что сумма снятия не превышает баланс счета. Если она превышает баланс, баланс должен остаться неизменным,
// а метод должен вывести сообщение: "Withdrawal amount exceeded account balance"
package org.example;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args)
    {
        // Создаем два объекта класса Account с начальными значениями для имени и баланса
        Account account1 = new Account("Jane Green", 50.00);  // Учетная запись с положительным балансом
        Account account2 = new Account("John Blue", -7.53);   // Учетная запись с отрицательным балансом, что не должно быть допустимо

        // Вывод начального баланса для каждой учетной записи
        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());

        // Создаем объект Scanner для считывания ввода от пользователя
        Scanner input = new Scanner(System.in);

        // Ввод суммы для снятия с первой учетной записи (account1)
        System.out.print("Enter withdrawal amount for account1: ");
        double withdraw1Amount = input.nextDouble();  // Считывание суммы для снятия
        System.out.printf("%nWithdrawing %.2f from account1 balance%n%n", withdraw1Amount);  // Вывод сообщения о снятии средств

        // Выполняем операцию снятия средств с account1
        account1.withdraw(withdraw1Amount);

        // Вывод обновленного баланса после снятия средств для обеих учетных записей
        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: $%.2f%n%n", account2.getName(), account2.getBalance());

        // Ввод суммы для снятия со второй учетной записи (account2)
        System.out.print("Enter withdrawal amount for account2: ");
        double withdraw2Amount = input.nextDouble();  // Считывание суммы для снятия
        System.out.printf("%nWithdrawing %.2f from account2 balance%n%n", withdraw2Amount);  // Вывод сообщения о снятии средств

        // Выполняем операцию снятия средств с account2
        account2.withdraw(withdraw2Amount);

        // Вывод обновленного баланса для обеих учетных записей после всех операций
        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
