package org.example.Sem_4.bank;

public class Program {
    public static void main(String[] args) {
        Entity entity = new Entity("Рога и копыта", "123124124");
        DebetAccount<Entity> entityDebetAccount1 = new DebetAccount<>(entity, 2000000);

        Person person = new Person("Клиент", "1231234");
        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person, 305);
        Transaction<Accaunt<?>> transaction = new Transaction<>(entityDebetAccount1, creditAccount1, 30000);
        transaction.execute();

    }
}