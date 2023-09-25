package org.example.Seminar6.isp;

public class InternetPaymentService extends PaymentService implements
        WebMobeyPayble,CreditCardPayble,PhonePayble {
    @Override
    public void payWebmoney(double amout) {
        System.out.printf("Internet pay by web money %.2f\n", amout);
    }

    @Override
    public void payCreditCard(double amout) {
        System.out.printf("Internet pay by credit card %.2f\n", amout);

    }

    @Override
    public void payPhoneNumber(double amout) {
        System.out.printf("Internet pay by phone number %.2f\n", amout);
    }
}
