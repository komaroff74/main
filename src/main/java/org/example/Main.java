package org.example;

import static java.lang.Integer.valueOf;

public class Main {
    public static void main(String[] args) {

        String[][] stringArray1 = new String[][] {
            {"3", "2", "7", "5"},
            {"3", "6", "5", "4"},
            {"3", "1", "6", "6"},
            {"3", "1", "6", "9"}
    };
    String[][] stringArray2 = new String[][] {
            {"3", "2", "7", "5"},
            {"3", "6", "5", "4"},
            {"3", "1", "6", "6"},
            {"3", "f", "6", "9"}
    };
    String[][] stringArray3 = new String[][] {
            {"3", "2", "7"},
            {"3", "6", "5", "4"},
            {"3", "1", "6", "6"},
            {"3", "f", "6", "9"}
    };
    String[][] stringArray4 = new String[][] {
            {"3", "6", "5", "4"},
            {"3", "1", "6", "6"},
            {"3", "f", "6", "9"}
    };

        try {
        System.out.println("Сумма массива равна " + changeAndSum(stringArray1));
    } catch (MyArraySizeException | MyArrayDataException r) {
        System.out.println(r);
    }
        try {
        System.out.println("Сумма массива равна " + changeAndSum(stringArray2));
    } catch (MyArraySizeException | MyArrayDataException r) {
        System.out.println(r);
    }
        try {
        System.out.println("Сумма массива равна " + changeAndSum(stringArray3));
    } catch (MyArraySizeException | MyArrayDataException r) {
        System.out.println(r);
    }
        try {
        System.out.println("Сумма массива равна " + changeAndSum(stringArray4));
    } catch (MyArraySizeException | MyArrayDataException r) {
        System.out.println(r);
    }
}

    private static int changeAndSum (String[][] in) throws MyArraySizeException, MyArrayDataException {
        int arrLong = 4;
        int sum = 0;


        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Размер массива должна быть %dх%d.", arrLong, arrLong));
        }

        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Размер массива должна быть %sх%s.", arrLong, arrLong));
            }
        }

        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Индексы [%d][%d] хранят не целое число %s.", i, j, in[i][j]));
                }
            }
        }

        return sum;
    }

}