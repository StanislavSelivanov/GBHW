package com.company;

public class Cat extends Animals {

    private String name;
    private String color;
    private int age;
    private int catRun = 200;
    private double catJump = 2;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void run(int a) {
        if (a >= 0 & a <= catRun) System.out.println(true);
        else System.out.println(false);
    }

    @Override
    public void swim(int a) {
        System.out.println(false);;
    }

    @Override
    public void jump(int a) {
        if (a >= 0 & a <= catJump) System.out.println(true);
        else System.out.println(false);
    }

    @Override
    public void jump(double a) {
        if (a >= 0 & a <= catJump) System.out.println(true);
        else System.out.println(false);
    }

}
