package Ex1014;

import java.util.Arrays;

public class InsertionSort01 {

    public int[] sort(int[] arr){
        int i=1;

        for (int j=i;j==1;j--){
            int tem=0;
            if(arr[j]<arr[j-1]){
                tem=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=tem;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] arr ={8,5,6,2,4};
        InsertionSort01 is = new InsertionSort01();
        System.out.println(Arrays.toString(is.sort(arr)));


    }
}
