package com.company.maze;

import java.util.Random;

public class TwoDArrays {
    public static void main(String[] args) {
        int[] array = new int[10];

        int[] array2 = new int[]{1, 2, 7, 9, 0, 323, 632, 21};
        //can initialize like this
        int[][] array2D = new int[10][10];
        //or like this
//        int[][] array2D2 = new int[4][4][4];

        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                if(i == j){
                    array2D[i][j] = 1;
                }
                Random random = new Random();
                int randomNumber = random.nextInt(100);
                array2D[i][j] = randomNumber;
                System.out.print(array2D[i][j] + " ");

            }
            System.out.println();
            System.out.println("--------");

        }

//        for (int integer: array) {
//            System.out.println("integer" + integer);
//
//        }
//        System.out.println("---------------------------------------------");
//        for (int i = 0; i < array.length ; i++) {
//            System.out.println("integer" + array[i]);
//
//        }

    }
}
