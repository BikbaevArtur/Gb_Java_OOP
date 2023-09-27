package org.example.Seminar7.builder;

public class Program {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setProductId(1)
                .setProductName("lol")
                .setQnt(3)
                .setPrice(200)
                .setClientName("Vafla")
                .builder();
    }
}
