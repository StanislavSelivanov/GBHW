package com.company;

public class Plate {
    private int food;

    public void addFood(int food){
        this.food += food;
    }

    public void printInfo() {
        System.out.println("В миске: " + food);
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public boolean isPlateFool() {
        if (food >=7) return true;
        else return false;
    }
}
