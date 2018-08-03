package fourthWeekHomeWork;

public class CommonElements {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 25, 6, 12, 71};
        int[] array2 = new int[]{2, 7, 6, 11, 12};

        findEqualsInArray(array1, array2);
    }

    public static void findEqualsInArray(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int array1Element = array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (array1Element == array2[j]) {
                    System.out.println("Both arrays have a value  " + array1Element + " at indexes " + i + " and " + j + " respectively.");

                }

            }

        }

    }

}
