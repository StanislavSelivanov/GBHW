package com.company;

public class Main {

    public static String[][] strArray = {{"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}};
//    public static String[][] strArray = {{"4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}};
//    public static String[][] strArray = {{"4", "A", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}, {"4", "4", "4", "4"}};
    public static int arrayLength = 4;

    public static void main(String[] args) {

        try {
            culculationArray(strArray);
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }

    }

    private static void culculationArray(String[][] strArray) throws MyArrayDataException, MyArraySizeException {

        int strSum = 0;

        if (strArray[0].length != arrayLength | strArray.length != arrayLength)
            throw new MyArraySizeException("Массив не соответствует размеру [4][4]");

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray.length; j++) {
                try {
                    strSum += Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(strSum);
    }


}
