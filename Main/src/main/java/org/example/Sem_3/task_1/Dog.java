package org.example.Sem_3.task_1;

public class Dog extends Animal {
    private static  int counter;

    public static int getCounter() {
        return counter;
    }

    {
        System.out.println("Initializer-Dog");
        counter++;
    }

    public Dog(String name, int maxRun, int maxSwim){
        super(name,maxRun,maxSwim);
        System.out.println("Constructor-Dog");
    }

    public Dog(String name){
        super(name,200,200);
        System.out.println("Constructor-dog");
    }
}
