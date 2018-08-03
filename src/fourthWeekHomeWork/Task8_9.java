package fourthWeekHomeWork;

import java.util.Arrays;

public class Task8_9 {
    //Find the second largest and second smallest element in an array
    //Do it by sorting the array and using +1 and -1 from the ends..
    //use Arrays.sort()
    public static void main(String[] args) {
        int [] array = new int[]{8, 55, 1, 20, 18, 21, 93, 102, 66, 2, 5, 9, 43};

        int secondToLargest = findSecondToLargest(array);
        System.out.println(secondToLargest);

        int secondToSmallest = findSecondToSmallest(array);
        System.out.println(secondToSmallest);
    }

    public static int findSecondToLargest(int[] array){
        Arrays.sort(array);

        return array[array.length-2];

    }

    public static int findSecondToSmallest(int[] array){
        Arrays.sort(array);

        return array[1];

    }
}
