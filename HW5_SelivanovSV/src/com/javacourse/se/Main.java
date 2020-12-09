package com.javacourse.se;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];

        Employee person1 = new Employee("Петров В. А.", "Manager", "PetrVasAleks@mail.ru", "8999225481", 2500000, 31);
        Employee person2 = new Employee("Аскаков И. В.", "Superviser", "AskIgorVas@mail.ru", "86123127", 5000000, 35);
        Employee person3 = new Employee("Бабкин О. Г.", "Officer", "BabkOlgGrig@mail.ru", "87259841", 7000000, 41);
        Employee person4 = new Employee("Юрков А. С.", "Cleaner", "YurkAleksSerg@mail.ru", "89099094545", 1500000, 21);
        Employee person5 = new Employee("Гарюмов В. А.", "Director", "GryumVicAlek@mail.ru", "84957777171", 10000000, 52);

        persArray[0] = new Employee("Петров В. А.", "Manager", "PetrVasAleks@mail.ru", "8999225481", 2500000, 31);
        persArray[1] = new Employee("Аскаков И. В.", "Superviser", "AskIgorVas@mail.ru", "86123127", 5000000, 35);
        persArray[2] = new Employee("Бабкин О. Г.", "Officer", "BabkOlgGrig@mail.ru", "87259841", 7000000, 41);
        persArray[3] = new Employee("Юрков А. С.", "Cleaner", "YurkAleksSerg@mail.ru", "89099094545", 1500000, 21);
        persArray[4] = new Employee("Гарюмов В. А.", "Director", "GryumVicAlek@mail.ru", "84957777171", 10000000, 52);

        // Вывод метода через 'fori'
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].giveMeInformation();
        }
        // Вывод метода через 'enhanced for loop'
        for (Employee employee : persArray) {
            if (employee.age > 40) employee.giveMeInformation();
        }
        // Ну а тут вообще космос))))
        Arrays.stream(persArray).filter(employee -> employee.age > 40).forEach(Employee::giveMeInformation);

    }
}
