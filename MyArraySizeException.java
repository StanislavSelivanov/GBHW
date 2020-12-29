package com.company;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String messege) {
        System.err.println(messege);
    }
}
