package com.company;

public class Wall implements Obstacles {

    private int value = 0;

    public Wall(int value) {
        this.value = value;
    }

    @Override
    public int getValue() {
        return value;
    }
}
