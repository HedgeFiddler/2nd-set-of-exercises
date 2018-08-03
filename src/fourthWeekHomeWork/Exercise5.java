package fourthWeekHomeWork;

public class Exercise5 {
    public static void main(String[] args) {
        //Find duplicate values inside of an array
        int[] array = new int[]{1, 7, 9, 3, 16, 9, 25, 25};
        findDuplicates(array);

    }

    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int arrayElement1 = array[i];

            for (int j = 1; j < array.length; j++) {
                if (i == j){
                    j++;
                }
                if (arrayElement1 == array[j]) {
                    System.out.println("There's a duplicate value " + array[j] + " at index " + j);
                }
            }

        }
    }
}
