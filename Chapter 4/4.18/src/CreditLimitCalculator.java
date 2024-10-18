//(Credit Limit Calculator) Разработайте Java-приложение, которое определяет,
//превысил ли какой-либо из нескольких клиентов универмага кредитный лимит на счёте.
// Для каждого клиента доступны следующие данные:
//a) номер счёта
//b) баланс на начало месяца
//с) общая сумма всех покупок, совершённых клиентом в этом месяце
//d) общая сумма всех кредитов, применённых к счёту клиента в этом месяце
//e) разрешённый кредитный лимит.
//Программа должна вводить все эти данные в виде целых чисел, вычислять новый баланс
//(начальный баланс + покупки - кредиты), отображать новый баланс и определять,
//превышает ли новый баланс кредитный лимит клиента. Для тех клиентов, чей кредитный
// лимит превышен, программа должна выводить сообщение "Кредитный лимит превышен".
import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ввод данных
        System.out.print("Enter account number (or -1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {
            // Ввод информации о клиенте
            System.out.print("Enter beginning balance: ");
            int beginningBalance = input.nextInt();

            System.out.print("Enter total charges: ");
            int totalCharges = input.nextInt();

            System.out.print("Enter total credits: ");
            int totalCredits = input.nextInt();

            System.out.print("Enter credit limit: ");
            int creditLimit = input.nextInt();

            // Вычисление нового баланса
            int newBalance = beginningBalance + totalCharges - totalCredits;

            // Вывод нового баланса
            System.out.println("New balance is: " + newBalance);

            // Проверка превышения кредитного лимита
            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            // Ввод следующего номера счета или завершение программы
            System.out.print("\nEnter account number");
            accountNumber = input.nextInt();
        }

        input.close();
    }
}
