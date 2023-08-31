package org.example.Sem_1;

public class BottleOfMilk extends Product {
    private double volume; // объем
    private int fat; // жирность

    public BottleOfMilk(String name, String brand, double prise, double volume,int fat){
        super(name, brand, prise);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с молоком] %s - %s - %.2f - v : %.2f - f: %d",name,brand,prise,volume,fat);
    }
}