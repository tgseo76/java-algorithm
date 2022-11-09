package ex1109;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {3,7,4,9,10,223,111,23,2,39};

        for (int i = 0; i < arr.length-1; i++) {
            int minIdx=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    minIdx=j;
                }
            }
            int tem=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=tem;
        }


        System.out.println(Arrays.toString(arr));



    }
}
