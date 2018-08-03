package fourthWeekHomeWork;

public class FindMinMaxOfArray {
    public static void main(String[] args) {
        int [] array1 = new int[]{9,1,0,2,8,18,92,10,6,3};

        int maxVariable = findMax(array1);
        System.out.println(maxVariable);

        int minVariable = findMin(array1);
        System.out.println(minVariable);
    }

    public static int findMax(int[] array){
        int currentMax = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] > currentMax){
                currentMax = array[i];
            }

        }
        return currentMax;
    }
    public static int findMin(int[] array){
        int currentMin = 0;
        for (int i = 0; i < array.length ; i++) {
            if(array[i] < currentMin){
                currentMin = array[i];
            }

        }
        return currentMin;
    }
}
