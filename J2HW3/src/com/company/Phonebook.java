package com.company;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> listOfPersons;

    public Phonebook(ArrayList<Person> listOfPersons) {
        this.listOfPersons = listOfPersons;
    }

    public void addNewPerson(String name, ArrayList<String> phone) {
        Person person = new Person(name, phone);
        listOfPersons.add(person);
    }

    int foundEquals = 0;

    public void getPersonInfo(String PersonName) {

        for (int i = 0; i < listOfPersons.size(); i++) {
            if ((listOfPersons.get(i).getName()) == PersonName) {
                System.out.println(listOfPersons.get(i).getName() + " - " + (listOfPersons.get(i).getPhone()));
                foundEquals++;
            }

        }

        if (foundEquals == 0) System.out.println("Person " + PersonName + " not found.");

    }
}
