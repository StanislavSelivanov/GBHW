package com.javacourse.se;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 6;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static int xAi = -1;
    public static int yAi = -1;
    public static int lastHumanTurnX = -1;
    public static int lastHumanTurnY = -1;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X, DOTS_TO_WIN)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O, DOTS_TO_WIN)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }
    public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
    public static void printMap() {
        System.out.print("*" + " ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void humanTurn() {
        int x = 0, y = 0;
        System.out.println("Введите координаты в формате X Y");
        do {
            System.out.print("Координаты х = ");
            if (sc.hasNextInt()) {
                x = sc.nextInt()-1;
            } else {
                sc.next();
                continue;
            }
            System.out.print("Координаты у = ");
            if (sc.hasNextInt()) {
                y = sc.nextInt()-1;
            } else {
                sc.next();
            }
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
        lastHumanTurnX = y;
        lastHumanTurnY = x;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) return false;
        if (map[x][y] == DOT_EMPTY) return true;
        return false;
    }
    public static void aiTurn() {
        int x = 0, y = 0;
        do {

            for (int i = 0; i < DOTS_TO_WIN-1; i++) {

                if (bestAiTurn(DOT_O, DOTS_TO_WIN - i)) {
                    x = xAi;
                    y = yAi;
                    break;
                }
                if (bestAiTurn(DOT_X, DOTS_TO_WIN - i)) {
                    x = xAi;
                    y = yAi;
                    break;
                } else;
                    x = lastHumanTurnX + rand.nextInt();
                    y = lastHumanTurnY + (int) rand.nextInt()*1;
            }
//                x = rand.nextInt(SIZE);
//                y = rand.nextInt(SIZE);
//
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[x][y] = DOT_O;
    }

    private static boolean bestAiTurn(char symb, int win) {
        // Проверка горизонтальных линий
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    map[i][j] = symb;
                    if (checkWin(symb, win)) {
                        map[i][j] = DOT_EMPTY;
                        xAi = i;
                        yAi = j;
                        return true;
                    } else map[i][j] = DOT_EMPTY;
                }
            }
        }
        // Проверка по вертикали
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[j][i] == DOT_EMPTY) {
                    map[j][i] = symb;
                    if (checkWin(symb, win)) {
                        map[i][j] = DOT_EMPTY;
                        xAi = j;
                        yAi = i;
                        return true;
                    } else map[j][i] = DOT_EMPTY;
                }
            }
        }
        // Проверка диагонали i = j
        for (int iii = 0; iii < SIZE; iii++) {
            if (map[iii][iii] == DOT_EMPTY) {
                map[iii][iii] = symb;
                if (checkWin(symb, win)) {
                    map[iii][iii] = DOT_EMPTY;
                    xAi = iii;
                    yAi = iii;
                    return true;
                } else map[iii][iii] = DOT_EMPTY;
            }
        }
        // Проверка обратной диагонали
        for (int i = 0; i < map.length; i++) {
            if (map[map.length-1-i][i] == DOT_EMPTY) {
                map[map.length-1-i][i] = symb;
                if (checkWin(symb, win)) {
                    map[map.length-1-i][i] = DOT_EMPTY;
                    xAi = i;
                    yAi = i;
                    return true;
                } else map[map.length-1-i][i] = DOT_EMPTY;
            }
        }
        return false;
    }

    public static boolean checkWin(char symb, int checks) {
        int sumToWin;
        // Проверка горизонтальных линий
        for (int i = 0; i < SIZE; i++) {
            sumToWin = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb) sumToWin += 1;
                if (sumToWin == checks) return true;
            }
        }
        // Проверка вертикальных линий
        for (int ii = 0; ii < SIZE; ii++) {
            sumToWin = 0;
            for (int jj = 0; jj < SIZE; jj++) {
                if (map[jj][ii] == symb) sumToWin += 1;
                if (sumToWin == checks) {
                    return true;}
            }
        }
        // Проверка диагонали i = j
        sumToWin = 0;
        for (int iii = 0; iii < SIZE; iii++) {
            if (map[iii][iii] == symb) sumToWin += 1;
            if (sumToWin == checks) return true;
        }
        // Проверка обратной диагонали
        sumToWin = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[map.length-1-i][i] == symb) sumToWin += 1;
            if (sumToWin == checks) return true;
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
}
