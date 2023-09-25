package org.example.Seminar6.lsp;

public class Bird {
    protected boolean canFly = true;
    protected int flySpeed = 10;

    public int getFlySpeed() {
        return flySpeed;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public  void fly(){
        System.out.printf("Птица летит со скоростью %d",flySpeed);
    }


}
