package org.example.Seminar6.ocp;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));
        double sumArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof RightTriangle) {
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            }
            if (shape instanceof Square) {
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);

            }
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                sumArea += Math.PI * circle.getRadius() * circle.getRadius();
            }

        }
        System.out.printf("Сумма площедей фигур равна %.2f\n ",sumArea );


        List<SharpeV2>sharpeV2s = new ArrayList<>();
        sharpeV2s.add(new RightTriangleV2(2, 3));
        sharpeV2s.add(new SquareV2(4));
        sharpeV2s.add(new CircleV2(3));
        double sumAreaV2 =0;

        for (SharpeV2 sharpeV2:sharpeV2s ) {
            sumAreaV2+=sharpeV2.getArea();

        }

        System.out.printf("Сумма площедей фигур равна %.2f \n",sumAreaV2 );
    }




}
