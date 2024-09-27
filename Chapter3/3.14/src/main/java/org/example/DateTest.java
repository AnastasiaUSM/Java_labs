package org.example;

public class DateTest {
    public static void main(String[] args) {
        // Создаем объект Date
        Date date = new Date(10, 21, 2024); // 21 сентября 2023 года

        System.out.print("Current date: ");
        date.displayDate();

        date.setMonth(10);
        date.setDay(5);
        date.setYear(2024);

        // Отображаем обновленную дату
        System.out.print("Updated date: ");
        date.displayDate();
    }
}
