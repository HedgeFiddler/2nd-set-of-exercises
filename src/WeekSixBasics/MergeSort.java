package WeekSixBasics;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] testData = new int[] {
                9, 12,26, 93, 19, -1, 35        };

        mergeSort(testData);
        System.out.println(Arrays.toString(testData));
    }

    public static int[] mergeSort(int[] list){
        if(list.length <= 1 ){
            return list;
        }
        int[] first = new int[list.length/2];
        int[] second = new int[list.length - first.length];

        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);

        return list;
    }

    public static void merge(int[] first, int[] second, int[] result){

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst] < second[iSecond]){
                result[iMerged] = first[iFirst];
                iFirst++;
            } else {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }

}
