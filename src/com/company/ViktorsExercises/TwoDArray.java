package com.company.ViktorsExercises;

public class TwoDArray {
    //user enters "n" for size of 2dArray nXn
    //then user fills it with ints
    //find max element of array

    public static void main(String[] args) {

        int[][] array = new int[][]{{1, 2, 3}, {8, 2, 7}, {4, 4, 8}};
        print2DArray(array);
        sortAndPrint(array);


//        System.out.println("Please enter the size of your preferred array");
//        Scanner input = new Scanner(System.in);
//        int size = input.nextInt();
//        input.nextLine();
//        int[][] array = new int[size][size];
//


//        for (int i = 0; i < size; i++) {
//
//            System.out.println("Please enter the space separated values for the array row " + (i + 1));
//            String s = input.nextLine();
//            String[] arrayItems = s.split("\\s+");
//
//            for (int j = 0; j < size; j++) {
//                int arrayItem = Integer.parseInt(arrayItems[j]);
//                array[i][j] = arrayItem;
//
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length ; j++) {
//
//                System.out.print(array[i][j] + "   ");
//            }
//            System.out.println();
//
//        }
//
//        System.out.println();
//        Arrays.toString(array);
//        System.out.println();
//
//        System.out.println("Would your like to print the maximum element of your array?");
//        String answer = input.nextLine();
//        switch(answer){
//            case "yes":
//                System.out.println();
//                System.out.println("Your array's max element is " + findMaxElement(array));
//                break;
//            case "no":
//                System.out.println();
//                System.out.println("Well, that's a damn shame");
//                break;
//            default:
//                System.out.println();
//                System.out.println("That's not an option");
//                break;
//        }
    }

    public static int findMaxElement(int[][] array) {
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }

        }
        return maxElement;
    }

    public static void printAllPositives(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    System.out.print(array[i][j]);
                }
            }

        }
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i);
        }
    }

    public static void sortAndPrint(int[][] array) {
        int[] maxValues = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int tempMax = 0;
            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] > tempMax) {
                    tempMax = array[i][j];
                }
            }
            maxValues[i] = tempMax;

        }
        sort(maxValues);
        print(maxValues);


    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j >= i + 1; j--) {

                if (array[j] < array[j - 1]) {

                    int tempValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempValue;
                }

            }

        }

    }

    //twoDimensional array
    //find the largest element in each row
    //print the rows in the order of the largest elements(largers first, smallers later)
}