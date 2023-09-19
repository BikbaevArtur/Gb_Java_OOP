package org.example.Seminar6.srp1;

public class SquareDraw {
    private final SquareV2 squareV2;

    public SquareDraw(SquareV2 squareV2) {
        this.squareV2 = squareV2;
    }

    public void draw(){
        for(int i= 0;i<squareV2.getSide()*2;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i= 0;i<squareV2.getSide()*2;i++){
            System.out.print("*");
            for(int j= 1;j<squareV2.getSide()*2;j++){
                System.out.print(" ");}
        }

        for(int i= 0;i<squareV2.getSide()*2;i++){
            System.out.print("*");
        }
        System.out.println();
    }
}
