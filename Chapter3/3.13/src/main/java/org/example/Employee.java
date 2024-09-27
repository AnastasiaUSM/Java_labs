//Создайте класс под названием Employee, который включает три переменные экземпляра:
//имя (тип String), фамилия (тип String) и месячная зарплата (тип double).
//Предоставьте конструктор, который инициализирует эти три переменные экземпляра.
//Предоставьте методы set и get для каждой переменной экземпляра.
//Если месячная зарплата не является положительным числом, не устанавливайте ее значение.
//Напишите тестовое приложение под названием EmployeeTest, которое демонстрирует возможности
//класса Employee. Создайте два объекта Employee и выведите годовую зарплату для каждого объекта.
//Затем дайте каждому сотруднику 10% повышения и снова выведите годовую зарплату для каждого сотрудника.
package org.example;
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;

        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0.0;
        }
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }
}