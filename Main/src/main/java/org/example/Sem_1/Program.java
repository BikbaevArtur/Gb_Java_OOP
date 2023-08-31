package org.example.Sem_1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

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

        Product bottleOfWater1 =
                new BottleOfWater("Вода","akva",200,1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 =
                new BottleOfWater("Вода","akva",300,1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater3 =
                new BottleOfWater("Вода","akva",400,2);
        System.out.println(bottleOfWater1.displayInfo());

        List<Product> products = new ArrayList<>();



        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater2);

        VendingMachine vendingMachine = new VendingMachine(products);
       BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Вода",1);
           if(bottleOfWater != null ){
               System.out.println("Вы получили: ");
               System.out.println(bottleOfWater.displayInfo());
           }
           else {
               System.out.println("Такой бутылки нету");
           }



    }
}