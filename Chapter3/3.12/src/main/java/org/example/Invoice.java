//Создайте класс под названием Invoice, который может использоваться в магазине
//товаров для ремонта, чтобы представлять счет за товар, проданный в магазине.
//Класс Invoice должен включать четыре переменные экземпляра: номер детали (тип String),
//описание детали (тип String), количество покупаемого товара (тип int) и цену за единицу
//товара (тип double). Ваш класс должен иметь конструктор, который инициализирует эти четыре
//переменные экземпляра. Предоставьте методы set и get для каждой переменной экземпляра.
//Кроме того, предоставьте метод под названием getInvoiceAmount, который вычисляет сумму счета
//(т.е. умножает количество на цену за единицу товара), а затем возвращает сумму в виде значения
//типа double. Если количество не является положительным числом, оно должно быть установлено в 0.
//Если цена за единицу товара не является положительным числом, она должна быть установлена в 0.0.
// Напишите тестовое приложение под названием InvoiceTest
package org.example;
public class Invoice {
    // Переменные экземпляра
    private String partNumber;       // Номер детали
    private String partDescription;  // Описание детали
    private int quantity;            // Количество товара
    private double pricePerItem;     // Цена за единицу товара

    // Конструктор, который инициализирует переменные экземпляра
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;

        // Проверка количества: если количество не положительное, устанавливаем 0
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }

        // Проверка цены: если цена не положительная, устанавливаем 0.0
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    // Метод для вычисления общей суммы счета
    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    // Геттеры и сеттеры для переменных экземпляра

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }
}
