package org.example.Sem_3.task_2;

/**
 * Обычный рабочий(фулл-тайм)
 */

public class Worker extends Empoyee {


    public Worker(String name, String surName, double salary) {
        super(name, surName, salary);
    }

    @Override
    public double caculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная зарплата(фиксированная) %.2f",surName,name,salary);
    }
}
