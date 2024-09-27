//Создайте класс под названием `Date`, который включает три переменные экземпляра:
//месяц (тип `int`), день (тип `int`) и год (тип `int`). Предоставьте конструктор,
//который инициализирует эти три переменные экземпляра и предполагает, что предоставленные
//значения корректны. Предоставьте методы `set` и `get` для каждой переменной экземпляра.
//Также предоставьте метод `displayDate`, который выводит месяц, день и год, разделенные
//символом "/". Напишите тестовое приложение под названием `DateTest`, которое демонстрирует
//возможности класса `Date`.
package org.example;

public class Date {
    private int month;
    private int day;
    private int year;

    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void displayDate() {
        System.out.printf("%d/%d/%d%n", month, day, year);
    }
}