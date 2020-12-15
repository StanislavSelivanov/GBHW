package com.company;

public class Dog extends Animals {

    private String name;
    private String color;
    private int age;
    private int dogRun = 500;
    private double dogJump = 0.5;
    private int dogSwim = 10;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public void run(int a) {
        if (a >= 0 & a <= dogRun) System.out.println(true);
        else System.out.println(false);
    }

    @Override
    public void swim(int a) {
        if (a >= 0 & a <= dogSwim) System.out.println(true);
        else System.out.println(false);
    }

    @Override
    public void jump(int a) {
        if (a >= 0 & a <= dogJump) System.out.println(true);
        else System.out.println(false);
    }

    @Override
    public void jump(double a) {
        if (a >= 0 & a <= dogJump) System.out.println(true);
        else System.out.println(false);
    }

    @Override // метод вне рамок ДЗ, просто для себя практикуюсь
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", dogRun=" + dogRun +
                ", dogJump=" + dogJump +
                ", dogSwim=" + dogSwim +
                '}';
    }
}
