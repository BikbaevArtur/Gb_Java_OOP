package org.example.Seminar6.srp1;

public class Program {
    public static void main(String[] args) {
        SquareV2 square = new SquareV2(new Point(1,1),5);
        System.out.printf("Площадь фигуры %d\n",square.getArea());

        SquareDraw squareDraw=new SquareDraw(square,3);
        squareDraw.draw();


    }


}
