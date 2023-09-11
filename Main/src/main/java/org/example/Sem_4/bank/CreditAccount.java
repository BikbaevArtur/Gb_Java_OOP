package org.example.Sem_4.bank;

public class CreditAccount<T extends PersonalData>extends Accaunt<T> {
    public CreditAccount(T data, double amout) {
        super(data, amout);
    }
}
