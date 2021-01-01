package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Phonebook phonebook = new Phonebook(new ArrayList<Person>(Arrays.asList()));

        phonebook.addNewPerson("Vasya", new ArrayList<String>(Arrays.asList("111")));
        phonebook.addNewPerson("Vasya", new ArrayList<String>(Arrays.asList("ХХХ")));
        phonebook.addNewPerson("Petya", new ArrayList<String>(Arrays.asList("444", "555")));
        phonebook.addNewPerson("Misha", new ArrayList<String>(Arrays.asList("777", "888", "999")));

        phonebook.getPersonInfo("Vasya");
//        phonebook.getPersonInfo("Kolya");
    }

}
