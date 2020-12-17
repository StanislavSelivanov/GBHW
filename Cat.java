package com.company;

public class Cat {
    private String name;
    private boolean satiety;

    public Cat(String name, boolean satiety){
        this.name = name;
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        plate.decreaseFood(7);
    }

    public String getName() {
        return name;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean getSatiety() {
        return satiety;
    }
}
