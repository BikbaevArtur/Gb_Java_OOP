package org.example.Sem_3.task_1;

public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;

    private  static int idCounter;
    private  static int counter;
    private int id;

    public static int getCounter() {
        return counter;
    }

    public static int getIdCounter(){ //статические методы могут работать только со статическими данными
        return  idCounter;
    }

    static {
        System.out.println("Initializer-static-Animal"); // статический инициализатор вызывается только 1 раз за время работы
        idCounter = 1000;
    }

    {
        System.out.println("Initializer-Animal");
        id = ++idCounter;
        counter++;
    }


    public Animal(String name, int maxRun, int maxSwim) {
        System.out.println("Constructor-Animal");
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public void run(int distance) {
        if (distance < maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else {
            System.out.printf("%s не смогу пробежать %d метров\n", name, distance);
        }
    }

    public void swim(int distanceSwim) {
        if (distanceSwim < maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distanceSwim);
        } else {
            System.out.printf("%s не смогу проплыть %d метров\n", name, distanceSwim);
        }
    }


}
