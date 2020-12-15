package com.javacourse.se;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        startGame();
    }

    public static void startGame() {
        System.out.println("Привет! Я загадаю одно из перечисленных слов: \n" + Arrays.toString(words));
        System.out.println("Для выхода введите 'exit' или перезагрузите коспьютер.");
        System.out.println("Для повтора списка возможных слов введите 'words'" + "\n" + "Угадай, что я загадал?");
        String hiddenWord = randomWord();
        while (true) {
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("exit")) endGame();
            if (answer.equalsIgnoreCase("words")) System.out.println(Arrays.toString(words));
            if (hiddenWord.equalsIgnoreCase(answer)) {
                System.out.println("Молодец! Ты угадал! Загадонное слово: " + hiddenWord);
                endGame();
            }
            compareChars(hiddenWord, answer);
        }
    }

    private static String randomWord() {
        return words[(int) (Math.random() * words.length)];
    }

    private static void compareChars(String hiddenWord, String answer) {
        for (int i = 0; i < hiddenWord.length() & i < answer.length(); i++) {
            if (hiddenWord.charAt(i) == (answer.charAt(i))) {
                System.out.print(hiddenWord.charAt(i));
            } else System.out.print("#");
        }
        for (int i = answer.length(); i < 15; i++) {
            System.out.print("#");
        }
        System.out.println();

    }

    private static void endGame() {
        System.out.println("Пока мой маленький дружок! Скоро увидимся.");
        System.exit(0);
    }

}
