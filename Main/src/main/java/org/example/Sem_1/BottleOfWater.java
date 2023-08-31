package org.example.Sem_1;

public class BottleOfWater extends Product {
    private double volume;// объем
    public BottleOfWater(String name,String brand, double prise, double volume){
        super(name, brand, prise);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayInfo() {
        return String.format("[Бутылка с водой] %s - %s - %.2f - v : %.2f",name,brand,prise,volume);
    }
}
