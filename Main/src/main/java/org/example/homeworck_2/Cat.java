package org.example.homeworck_2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void eat(int plate) {
        System.out.printf("%s покушал, в миске осталось %d\n",name,plate);
    }
}
