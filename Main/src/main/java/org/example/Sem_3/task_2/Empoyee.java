package org.example.Sem_3.task_2;

/**
 * Работник
 */

public abstract class Empoyee {
    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилие
     */
    protected   String surName;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     * Расчет среднемесячной зп
     * @return
     */

    public  abstract double caculateSalary();

    public Empoyee(String name, String surName, double salary) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s",surName,name);
    }
}

