package org.example.Sem_1;

public class ChocolateBar extends Product {
    private int gram;//Грамм

    public ChocolateBar(String name ,String brand, double prise, int gram){
        super(name, brand, prise);
        this.gram= gram;
    }

    public int getGram() {
        return gram;
    }

    @Override
    public String displayInfo() {
        return String.format("[Шоколадный батончик] %s - %s - %.2f - g: %d",name,brand,prise,gram);
    }
}
