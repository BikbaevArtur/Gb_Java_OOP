package org.example.Sem_4.bank;

public class Accaunt <T extends PersonalData>{
    private final T data;
    private  double amout;




    public T getData() {
        return data;
    }

    public double getAmout() {
        return amout;
    }

    public void setAmout(double amout) {
        this.amout = amout;
    }

    public Accaunt(T data, double amout) {
        this.data = data;
        this.amout = amout;
    }

    @Override
    public String toString() {
        return "Accaunt{" +
                "data=" + data +
                ", amout=" + amout +
                '}';
    }
}
