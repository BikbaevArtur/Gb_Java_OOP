package org.example.Seminar6.isp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<CreditCardPayble> paymentServices = new ArrayList<>();
        paymentServices.add(new InternetPaymentService());
        paymentServices.add(new CustemPaymentService());

        for(CreditCardPayble paymentService:paymentServices){
            paymentService.payCreditCard(
                    2000);
            break;
        }


    }
}
