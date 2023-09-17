package org.example.lesson5;

public class Sum {
    protected  int num1;
    protected int num2;

    public Sum(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void sum(){
        System.out.printf("Сумма элементов %d и %d равна %d",num1,num2,num1+num2);
    }
}
