package org.example.Seminar6.ocp;

public class SquareV2 implements SharpeV2{

    @Override
    public double getArea() {
        return Math.pow(side,2);
    }

    public SquareV2(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    private int side;
}
