package org.example.Seminar6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class Save {
    private OrderV2 orderV2;

    public Save(OrderV2 orderV2) {
        this.orderV2 = orderV2;
    }

    public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + orderV2.getClientName() + "\",\n");
            writer.write("\"product\":\"" + orderV2.getProduct() + "\",\n");
            writer.write("\"qnt\":" + orderV2.getQnt() + ",\n");
            writer.write("\"price\":" + orderV2.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
