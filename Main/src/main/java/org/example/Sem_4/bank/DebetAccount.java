package org.example.Sem_4.bank;

public class DebetAccount<T extends PersonalData> extends Accaunt<T> {
    public DebetAccount(T data, double amout) {
        super(data, amout);
    }
}

