package com.javacourse.se;

import java.util.Scanner;

public class Main {

    private static int chances = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        startGame(chances);

    }

    private static void startGame(int triesQuantity) {
        System.out.println("Привет дружок, попробуй угадать загадонное число от 0 до 9. Ты можешь гадать " + triesQuantity + " раз(а).");
            int randNumber = (int) (Math.random() * 10);
            int score = triesQuantity;
            for (int i = 0; i < triesQuantity; i++) {
                System.out.print("Введи свой вариант: ");
                score -= 1;
                int answer = scanner.nextInt();
                if (answer < randNumber) {
                    System.out.println("Загаданное число больше! Число попыток " + score);
                } else if (answer > randNumber) {
                    System.out.println("Загаданное число меньше! Число попыток " + score);
                } else if (answer == randNumber) {
                    System.out.println("Красавчик! Ты угадал! с " + (i+1) + " раз(а)!");
                    break;
                }
            }
            System.out.println("Игра окончена.");
            endGame();
    }

    private static void endGame() {

        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        String continueGame = scanner.next();
        switch (continueGame) {
            case "1", "один", "да" -> startGame(chances);
            case "0", "ноль", "нет" -> System.exit(0);
            default -> endGame();
        }
        scanner.close();
    }
}