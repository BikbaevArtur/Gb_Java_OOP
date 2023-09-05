package org.example.Sem_2.Sample_1;

public class Program {
    public static void main(String[] args) {
        // Абстракция это тип которая описывает контракт но не предоставляет его полную реализацию

        Cat cat1 = new Cat();
        cat1.jump();
        cat1.setColor("Рыжий");

        Dog dog1 = new Dog();

        Animal cat2 = new Cat(); // одинаковые по природе объекта что cat1 - cat 2
        cat2.jump();

        Animal[] animals = new Animal[2]; // что бы добавить и котов и собак в массив, используем суперкласс Animal
        animals[0] = cat1;//Если создать массив Cat, то можно будет создать только массив с котами
        animals[1] = dog1;// Когда содаешь родительский класс, можно работать со всеми наследуемыми классами

        processVoice(animals);
    }

    public static void processVoice(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].voice();
            if (animals[i] instanceof Cat) {// проверка наследование
                Cat cat = (Cat) animals[i]; // преобразование снизу вверх, считается небозопасным
                System.out.println(cat.getColor());

                Animal animal = cat; // преобразование наверх по ирархии идет без дополнительных
                Object obj = animal;
            }
        }

    }

}
