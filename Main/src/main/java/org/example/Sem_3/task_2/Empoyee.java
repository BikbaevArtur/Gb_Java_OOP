package org.example.Sem_3.task_2;

import java.util.Random;

/**
 * Работник
 */
public abstract class Empoyee implements Comparable<Empoyee> {
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
     * Возраст
     */
    protected int age;

    /**
     * Расчет среднемесячной зп
     * @return
     */


    public  abstract double caculateSalary();

    public Empoyee(String name, String surName, double salary,int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %.2f",surName,name,age,salary);
    }

    @Override
    public int compareTo(Empoyee o) {
        int surNameres = surName.compareTo(o.surName);
        if(surNameres ==0){
            return name.compareTo(o.name);
        }
        return surNameres;
    }
}


