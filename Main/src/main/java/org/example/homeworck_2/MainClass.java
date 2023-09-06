package org.example.homeworck_2;

public class MainClass {
    public static void main(String[] args) {
        Cat[] catbanda = {
                new Cat("Barsik", 5, false),
                new Cat("Sosiska", 10, false),
                new Cat("Kolbasnik", 6, false),
                new Cat("Uhoder", 3, false),
                new Cat("Nigga", 7, false),
                new Cat("Bandit", 8, false),
                new Cat("Murz", 6, false),
                new Cat("Mishaur", 3, false),
                new Cat("Vdovadel", 10, false),
                new Cat("KillerMaus", 15, false),
                new Cat("DonCaton", 30, false),
        };


        Plate plate = new Plate(100);
        plate.info();
        for (Cat cat : catbanda) {
            if (plate.getFood() >= cat.getAppetite()) {
                plate.setFood(plate.getFood() - cat.getAppetite());
                cat.eat(plate.getFood());
                cat.setSatiety(true);
                System.out.printf("%s наелся\n", cat.getName());
            } else {
                System.out.printf("В миске осталось %d еды\n", plate.getFood());
                System.out.printf("%s голодный и в ярости, ему не хватило еды\n", cat.getName());

            }
        }


    }
}
