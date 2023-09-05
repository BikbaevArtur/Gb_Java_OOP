package org.example.Sem_2.Smple_3;

public class Track extends Obstracle {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getLength() {
        return length;
    }
}
