package org.example.Sem_1;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product();
//        product1.name = "Product1";
//        product1.brand = "Brand1";
//        product1.prise =200;
        System.out.println(product1.displayInfo());

        Product product2 = new Product("Product2","Brand2",100);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        System.out.println(product3.displayInfo());

        Product product4 = new Product("qw","qw",100);
        System.out.println(product4.displayInfo());
    }
}