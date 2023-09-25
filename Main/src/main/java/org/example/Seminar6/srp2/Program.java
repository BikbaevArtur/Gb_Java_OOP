package org.example.Seminar6.srp2;

public class Program {
    public static void main(String[] args) {

//        Order order = new Order();
//        order.inputFromConsole();
//        order.saveToJson();

        OrderV2 orderV2 = new OrderV2();
        orderV2.inputFromConsole();
        Save save = new Save(orderV2);
        save.saveToJson();
    }



}
