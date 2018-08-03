import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int zeroes = 0;
        int negatives = 0;
        int positives = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                positives++;
            }
            if (arr[i] < 0) {
                negatives++;
            }
            if (arr[i] == 0) {
                zeroes++;
            }

        }

        System.out.println("relation of zeroes: " + (zeroes / arr.length));
        System.out.println("relation of negatives: " + (negatives / arr.length));
        System.out.println("relation of positives: " + (positives / arr.length));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
