package org.example.Sem_3.task_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Program {
    public static Random random = new Random();

    public static Empoyee generateEmpoyee() {
        String[] names = new String[]{"Иван", "Мурат", "Александр", "Екатерина", "Дмитрий",
                "Джо", "Сергей", "Анатольга", "Андрей", "Федот"};
        String[] surNames = new String[]{"Иванов", "Петров", "Сидоров", "Козлов", "Морозов",
                "Новикова", "Кузнецов", "Смирнова", "Павлов", "Лебедева"};
        int sallaryIndex = random.nextInt(200, 500);
        int WorkerOrFrelancer = random.nextInt(0, 2);
        int age = random.nextInt(18, 50);
        if (WorkerOrFrelancer == 0) {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(names.length)], sallaryIndex * 10, age);
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(names.length)], sallaryIndex * 10, age);
        }
    }


    public static Empoyee[] generateEmpoyee(int count) {
        Empoyee[] empoyees = new Empoyee[count];
        for (int i = 0; i < count; i++) {
            empoyees[i] = generateEmpoyee();
        }
        return empoyees;
    }

    public static void main(String[] args) {
        Empoyee[] empoyees = generateEmpoyee(10);

        for (Empoyee empoyee : empoyees) {
            System.out.println(empoyee.toString());
        }
        System.out.println(" ");

        Arrays.sort(empoyees /*new SalaryComparator()*/);// сортировка работает по умолчанию
        //из за реализации в Empoyee
        for (Empoyee empoyee : empoyees) {
            System.out.println(empoyee.toString());
        }
        System.out.println(" ");

        Arrays.sort(empoyees, new AgeComparator());
        for (Empoyee empoyee : empoyees) {
            System.out.println(empoyee.toString());
        }
        System.out.println(" ");

    }
}
