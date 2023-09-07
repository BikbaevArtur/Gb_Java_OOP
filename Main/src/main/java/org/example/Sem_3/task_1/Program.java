package org.example.Sem_3.task_1;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Персик"),
                new Dog("Быстрый", 500, 20),
                new Dog("Тузик", 300, 30),
                new Dog("Шарик", 400, 350),
                new Dog("Бимка", 600, 50)

        };
//изначально вызывается конструктор базового типа, потом вызывается конструктор наследника
        // секция инициализатора, вызывается всегда перед выполнением контруктора
        for (Animal animal : animals) {
            System.out.printf("%d -%s \n",animal.getId(),animal.getName());
            animal.run(200);
            animal.run(300);
            animal.swim(30);
            animal.swim(50);
            animal.run(250);
            animal.run(500);

        }

        System.out.println("Счетчик индентификаторов объектов: " + Animal.getIdCounter());
        System.out.println("Было создано " +Cat.getCounter() + " котов");
        System.out.println("Было создано " +Dog.getCounter() + " собак");
        System.out.println("Было создано " +Animal.getCounter() + " животных");
    }
}
