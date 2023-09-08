package org.example.Sem_3.task_2;

/**
 * Обычный рабочий(фулл-тайм)
 */

public class Worker extends Empoyee {



    public Worker(String name, String surName, double salary,int age) {
        super(name, surName, salary,age);
    }

    @Override
    public double caculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d лет; Рабочий; Среднемесячная зарплата(фиксированная) %.2f",surName,name,age,salary);
    }
}
