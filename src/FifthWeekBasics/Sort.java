package FifthWeekBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int size = input.nextInt();
        System.out.println("Please enter array");
        int[] array = new int[size];
        //reading array
        for (int i = 0; i < size; ++i) {
            array[i] = input.nextInt();

        }
        //print2DArray(array);
        //sorting
        sort(array);
        printArray(array);


    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = array.length - 1; j >= i + 1; j--) {

                if (array[j] > array[j - 1]) {

                    int tempValue = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = tempValue;
                }

            }

        }

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
