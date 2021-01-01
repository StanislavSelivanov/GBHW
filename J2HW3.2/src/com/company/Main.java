package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<String> arr = new ArrayList(); // Создаём массив с повторяющимися значениями.
        arr.add("Apple");
        arr.add("Apple");
        arr.add("Book");
        arr.add("Book");
        arr.add("Bus");
        arr.add("Stone");
        arr.add("Car");
        arr.add("Cool");
        arr.add("Phone");
        arr.add("Cat");

        System.out.println(arr);

        Set<String> arr2 = new HashSet<>(); // Создаём массив с уникальными значениями и вносим туда элементы массива.

        arr2.addAll(arr);

        System.out.println(arr2);

    }
}
