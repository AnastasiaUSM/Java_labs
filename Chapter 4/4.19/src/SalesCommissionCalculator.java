//(Sales Commission Calculator) Крупная компания платит своим продавцам на основе комиссии.
//Продавцы получают $200 в неделю плюс 9% от их валовых продаж за эту неделю. Например, продавец,
//который продал товаров на сумму $5,000 за неделю, получает $200 плюс 9% от $5000,
//или в общей сложности $650. Вам предоставлен список товаров, проданных каждым продавцом.
import java.util.Scanner;

public class SalesCommissionCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] itemPrices = {239.99, 129.75, 99.95, 350.89};

        double baseSalary = 200.00;

        double grossSales = 0.0;

        // Количество проданных каждого товара
        System.out.println("Enter the number of each item sold last week:");

        for (int i = 0; i < itemPrices.length; i++) {
            System.out.print("Number of item " + (i + 1) + " sold: ");
            int quantitySold = input.nextInt();

            grossSales += quantitySold * itemPrices[i];
        }

        double commission = grossSales * 0.09;

        // Общий заработок
        double totalEarnings = baseSalary + commission;
        System.out.printf("Total earnings for the salesperson: $%.2f%n", totalEarnings);

        input.close();
    }
}
