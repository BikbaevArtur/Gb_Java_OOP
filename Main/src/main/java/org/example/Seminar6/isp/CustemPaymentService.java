package org.example.Seminar6.isp;

public class CustemPaymentService  extends PaymentService implements WebMobeyPayble,CreditCardPayble{
    @Override
    public void payWebmoney(double amout) {
        System.out.printf("Internet pay by web money %.2f\n", amout);
    }

    @Override
    public void payCreditCard(double amout) {
        System.out.printf("Internet pay by credit card %.2f\n", amout);

    }

}
