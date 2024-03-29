package sort;

import java.util.Arrays;

public class SortAlgorithm {
    public static int[] bubbleSort(int arr[]){
        if(arr.length <= 1 ) return arr;
        for(int  i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
}
