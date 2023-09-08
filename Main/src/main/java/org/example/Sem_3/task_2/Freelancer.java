package org.example.Sem_3.task_2;

/**
 * TODOO: Доработать
 */
public class Freelancer extends Empoyee {
    public Freelancer(String name, String surName, double salary,int age) {
        super(name, surName, salary,age);
    }

    @Override
    public double caculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d лет; Фрилансер; Среднемесячная зарплата %.2f",surName,name,age,salary);
    }
}
