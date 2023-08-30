package org.example.Sem_1;

/**
 * Товар
 */
public class Product {
    private String name; // Товар
    private String brand; // Изготовитель
    private double prise; // строимость

    public Product() {

    }

    public double getPrise(){
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public Product(String name){
        this(name,"Noname");
    }

    public Product(String name, String brand){
        this(name,brand,100);
    }

    public Product(String name,String brand, double prise){
        if(prise < 100){
            throw new RuntimeException("Неккоректная цена товара"); // выйдет ошибка
        }
        else {
            this.prise = prise;
        }
        if(name == null || name.length()<3){
            this.name = "Noname";
        }
        else {
            this.name = name;
        }
        if(brand == null || brand.length()<3){
            this.brand = "Noname";
        }
        else {
            this.brand = brand;
        }
    }

    public String displayInfo(){
        return String.format("%s-%s-%.2f",name,brand,prise);
    }
}
