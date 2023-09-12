package org.example.Sem_4.homework_4;

import java.util.ArrayList;

public class Box<T extends Fruct> {

    private ArrayList<T> fructs = new ArrayList<>();


    public float getWeight() {
        float totalWeight = 0;
        for (T fruct : fructs) {
            totalWeight += fruct.getWeight();
        }
        return totalWeight;
    }

    public void addFruit(T fruct){
        fructs.add(fruct);
    }

    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

    public void transfer (Box<T>box){
        if(!fructs.isEmpty() && this.getClass().equals(box.getClass())){
            box.fructs.addAll(this.fructs);
            fructs.clear();
        }
        else System.out.println("Нельзя переложить фрукты");
    }
}