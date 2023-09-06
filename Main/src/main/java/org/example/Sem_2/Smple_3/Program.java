package org.example.Sem_2.Smple_3;

public class Program {
    public static void main(String[] args) {
        Runner[] runners = {
                new Cat("Барсик", 1500, 300),
                new Cat("Мими", 5000, 500),
                new Robot("Вилли", 1000, 200),
                new Robot("Бибип", 1200, 220),
                new Human("Эля", 3000, 500),
                new Human("Пулькарот", 900, 100)

        };

        Obstracle[] obstracles = {
                new Track(1200),
                new Wall(200),
                new Track(3000),
                new Wall(400),
                new Track(1000),
                new Wall(250)
        };

        for (int i = 0; i < runners.length; i++) {
            for (int j = 0; j < obstracles.length; j++) {
                if (obstracles[j] instanceof Track) {
                    if(!runners[i].run(obstracles[j].getLength()))
                        break;
                }
                if (obstracles[j] instanceof Wall) {
                    if(!runners[i].jump(obstracles[j].getHeight()))
                        break;
                }

            }


        }
    }

}
