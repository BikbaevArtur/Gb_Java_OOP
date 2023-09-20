package org.example.Seminar6.ocp;

public class CircleV2 implements SharpeV2{

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public CircleV2(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    private final int radius;
}
