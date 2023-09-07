package org.example.Sem_3.task_2;

import java.util.Random;

public class Program {
    public static Random random = new Random();
    public static Worker generateWorker(){
        String[] names = new String[]{"Иван", "Мария", "Александр", "Екатерина", "Дмитрий",
                "Анна", "Сергей", "Ольга", "Андрей", "Татьяна"};
        String[]surNames = new String[]{"Иванов", "Петров", "Сидоров", "Козлов", "Морозов",
                "Новикова", "Кузнецов", "Смирнова", "Павлов", "Лебедева"};
        int sallaryIndex = random.nextInt(200,500);

        return new Worker(names[random.nextInt(names.length)],surNames[random.nextInt(names.length)],sallaryIndex*10);
    }

    public static Worker[] generateWorkers(int count){
        Worker[] workers = new Worker[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }
    public static void main(String[] args) {
//        Empoyee empoyee1 = generateWorker();
        Empoyee[] workers = generateWorkers(10);
//        System.out.println( empoyee1.toString());

        for (Empoyee empoyee: workers) {
            System.out.println(empoyee.toString());
        }

    }
}
