package org.example.Sem_4.bank;

public class Transaction<T extends Accaunt<? extends PersonalData>> {
    private final T from;
    private final T to;

    private final double amout;

    public double getAmout() {
        return amout;
    }

    public Transaction(T from, T to, double amout) {
        this.from = from;
        this.to = to;
        this.amout = amout;
    }

    public void execute() {
        if (from.getAmout() > amout) {
            System.out.printf("Осуществлен перевод средств между счетами на сумму %.2f руб\n", amout);
            System.out.printf("Счет списание : #%s; %.2f руб \n Счет зачисление: #%s; %.2f руб\n",
                    from.getData(), from.getAmout(), to.getData(), to.getAmout());
            from.setAmout(from.getAmout()-amout);
            to.setAmout(to.getAmout()+amout);

            System.out.println("Текущее состояние счетов: ");
            System.out.println(from);
            System.out.println(to);
        } else {
            System.out.println("Error денег нет");
        }
    }
}
