package org.example.Sem_1;

/**
 * Товар
 */
public class Product {
    protected String name; // Товар
    protected String brand; // Изготовитель
    protected double prise; // строимость


    public double getPrise(){
        return prise;
    }

    public void setPrise(double prise) {
        if(prise<100){
            throw new RuntimeException("Неккоректная цена");
        }
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {

        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
        }


    public  Product(){
        this("Noname");
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
        checkName(name);
        checkBrand(brand);


    }

    void  checkName(String name){
        if(name == null||name.length()<3){
            this.name = "Noname";
        }
        else {
            this.name = name;
        }
    }

    private void  checkBrand(String brand){
        if(brand == null||brand.length()<3){
            this.brand = "Noname";
        }
        else {
            this.brand = brand;
        }
    }

    private void  checkPrise(double prise){
        if(prise < 100){
            this.prise = 100;
        }
        else {
            this.prise = prise;
        }
    }


    public String displayInfo(){
        return String.format("%s-%s-%.2f",name,brand,prise);
    }
}
