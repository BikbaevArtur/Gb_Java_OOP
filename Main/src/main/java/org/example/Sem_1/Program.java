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

        Product product2 = new Product("Product2", "Brand2", 100);
        System.out.println(product2.displayInfo());

        Product product3 = new Product("Product3");
        System.out.println(product3.displayInfo());


        Product bottleOfWater1 =
                new BottleOfWater("Вода", "Aqua mineral", 200, 1);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfWater2 =
                new BottleOfWater("Вода", "Aqua mineral", 300, 1.5);
        System.out.println(bottleOfWater2.displayInfo());

        Product bottleOfWater3 =
                new BottleOfWater("Вода", "Borjomi", 350, 2.5);
        System.out.println(bottleOfWater3.displayInfo());


        List<Product> products = new ArrayList<>();


        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater2);


        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Вода", 1);

        if (bottleOfWater != null) {
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        } else {
            System.out.println("Такой бутылки нету");
        }

        Product chocolateBar1 = new ChocolateBar("Шоколад", "Сникерс", 120, 25);
        Product chocolateBar2 = new ChocolateBar("Шоколад", "Марс", 140, 25);
        Product chocolateBar3 = new ChocolateBar("Шоколад", "Твикс", 150, 30);

        products.add(chocolateBar1);
        products.add(chocolateBar2);
        products.add(chocolateBar3);

        ChocolateBar chocolateBar = vendingMachine.getChocolateBar("Шоколад", 25);
        if (chocolateBar != null) {
            System.out.println("Вы получили: ");
            System.out.println(chocolateBar.displayInfo());
        } else {
            System.out.println("Такого шоколада нету");
        }


    }

}