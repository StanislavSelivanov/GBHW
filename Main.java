package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Kis-Kis", "black",3); // Для себя включил имя, цвет и возраст. Тренируюсь.
        Dog dog = new Dog("Gau", "white",5);

        cat.run(100);
        cat.swim(100);
        cat.jump(100);

        dog.run(100);
        dog.swim(100);
        dog.jump(0.5);
        dog.jump(1);

        System.out.println(dog.toString()); // Просто для чебя, учусь)

    }
}
