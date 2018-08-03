package WeekSixBasics;

import java.util.Arrays;

public class NodeMergeSort {

    public static void main(String[] args) {
        Node[] nodeArray = new Node[] {
                new Node(9),
                new Node(12),
                new Node(26),
                new Node(93),
                new Node(-1),
                new Node(35)
        };

        mergeSort(nodeArray);
        System.out.println(Arrays.toString(nodeArray));
    }

    public static Node[] mergeSort(Node[] list){
        if(list.length <= 1 ){
            return list;
        }
        Node[] first = new Node[list.length/2];
        Node[] second = new Node[list.length - first.length];

        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        mergeSort(first);
        mergeSort(second);

        merge(first, second, list);

        return list;
    }

    public static void merge(Node[] first, Node[] second, Node[] result){

        int iFirst = 0;
        int iSecond = 0;
        int iMerged = 0;

        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst].data < second[iSecond].data){
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
