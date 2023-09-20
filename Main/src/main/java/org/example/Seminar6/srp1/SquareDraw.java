package org.example.Seminar6.srp1;

public class SquareDraw {

    //region Public Methods

    public void draw(){
        for(int i= 0;i<squareV2.getSide()*2*scale;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i= 0;i<squareV2.getSide()*2*scale;i++){
            System.out.print("*");
            for(int j= 1;j<squareV2.getSide()*2*scale;j++){
                System.out.print(" ");}
        }

        for(int i= 0;i<squareV2.getSide()*2*scale;i++){
            System.out.print("*");
        }
        System.out.println();
    }
    //endregion

    //region constructor


    public SquareDraw(SquareV2 squareV2) {
        this.squareV2 = squareV2;
    }

    public SquareDraw(SquareV2 squareV2, int scale) {
        this.squareV2 = squareV2;
        this.scale = scale;
    }
    //endregion

    //region privat Getter&Setter
    public SquareV2 getSquareV2() {
        return squareV2;
    }

    public int getScale() {
        return scale;
    }
    //endregion

    //region privat fields

    private final SquareV2 squareV2;

    public int scale=1;
    //endregion
}
