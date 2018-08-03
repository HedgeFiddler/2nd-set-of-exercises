package FifthWeekBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter size of array");
        int size = input.nextInt();
        System.out.println("Please eneter array");
        int[] array = new int[size];
        //reading array
        for (int i = 0; i < size ; ++i) {
            array[i] = input.nextInt();

        }

        //sorting
        printArray(array);
        Arrays.sort(array);
        System.out.println();
        printArray(array);


    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
