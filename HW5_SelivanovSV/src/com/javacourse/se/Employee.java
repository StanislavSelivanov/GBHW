package com.javacourse.se;

public class Employee {
    String fio;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    Employee(String fio, String position, String email, String phone, int salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void giveMeInformation (){
        System.out.println(fio);
        System.out.println(position);
        System.out.println(email);
        System.out.println(phone);
        System.out.println(salary);
        System.out.println(age);
    }

}
