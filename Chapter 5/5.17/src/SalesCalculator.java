import java.util.Scanner;

public class SalesCalculator {
    public static void main(String[] args) {
        // Создание объекта Scanner для ввода данных с клавиатуры
        Scanner input = new Scanner(System.in);

        double totalSales = 0.0;
        
        while (true) {
            // Запрос у пользователя номера продукта
            System.out.print("Enter product number (1-5) or 0 to quit: ");
            int productNumber = input.nextInt();

            // Проверка на выход из программы (sentinel)
            if (productNumber == 0) {
                break;
            }

            // Запрос у пользователя количества проданных единиц
            System.out.print("Enter quantity sold: ");
            int quantitySold = input.nextInt();

            // Переменная для хранения цены продукта
            double productPrice = 0.0;

            // Оператор switch для определения цены в зависимости от номера продукта
            switch (productNumber) {
                case 1:
                    productPrice = 2.98;
                    break;
                case 2:
                    productPrice = 4.50;
                    break;
                case 3:
                    productPrice = 9.98;
                    break;
                case 4:
                    productPrice = 4.49;
                    break;
                case 5:
                    productPrice = 6.87;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                    continue; // Если введен неправильный номер, пропустить итерацию
            }

            // Вычисление общей стоимости проданных товаров и добавление к общей сумме
            totalSales += productPrice * quantitySold;
        }

        // Окончательная сумма
        System.out.println("Total sales: $" + totalSales);

        input.close();
    }
}
