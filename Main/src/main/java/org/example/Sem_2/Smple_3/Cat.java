package org.example.Sem_2.Smple_3;

public class Cat extends BaseCat implements Runner {
    private final String name;
    private final int maxRun;
    private final int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean jump(int heigth) {
        if (maxJump >= heigth) {
            System.out.printf("%s перепрыгнул через стену высотой %d\n",name,heigth);
            return true;
        } else {
            System.out.printf("%s не перепрыгнул через стену высотой %d\n",name,heigth);
            return false;
        }
    }

    @Override
    public boolean run(int length) {
        if (maxRun >= length) {
            System.out.printf("%s пробежал дистанцию  %d\n",name,length);
            return true;
        } else {
            System.out.printf("%s не пробежал дистанцию  %d\n",name,length);
            return false;
        }
    }
}

class BaseCat {

}
