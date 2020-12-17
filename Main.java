package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Cat[] catsArray = new Cat[3];

        catsArray[0] = new Cat("Марсик", false);
        catsArray[1] = new Cat("Барсик", false);
        catsArray[2] = new Cat("Тарсик", false);

        Plate plate = new Plate();

        Scanner sc = new Scanner(System.in);

        System.out.println("Каждый кот потребляет 7 порций в неделю.");
        System.out.println("Уезжая на неделю, сколько порций Вы положите в миску?");

        int portion = sc.nextInt();

        plate.addFood(portion);

        for (int i = 0; i < catsArray.length; i++) {
            System.out.print("К миске подошёл кот " + catsArray[i].getName() + ". ");
            if (plate.isPlateFool()) {
                System.out.println("В миске достаточно еды. кот покушал.");
                catsArray[i].eat(plate);
                catsArray[i].setSatiety(true);
            } else System.out.println("В миске слишком мало еды. Кот остался голодным.");
            plate.printInfo();
        }
        System.out.println("Кто из котов остался сыт?");
        for (int i = 0; i < catsArray.length; i++) {
            System.out.println("Сытость кота " + catsArray[i].getName() + " = " + catsArray[i].getSatiety());

        }

    }
}
