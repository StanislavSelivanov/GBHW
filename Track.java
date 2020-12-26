package com.company;

public class Track implements Obstacles {

    private int value = 0;

    public Track(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
