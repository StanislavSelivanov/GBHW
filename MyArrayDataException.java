package com.company;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int i, int j) {
        System.err.println("Неверный формат данных в ячейках " + i + j);
    }
}
