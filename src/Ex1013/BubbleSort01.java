package Ex1013;

import java.util.Arrays;

public class BubbleSort01 {

    public void bubble(int[] arr,int j){
        int tem=-1;

        for (int i=0;i<arr.length-1;i++){
            if (arr[j]>arr[i+1]){
                tem=arr[j];
                arr[j]=arr[i+1];
                arr[i+1]=tem;
            }
        }
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = new int[] {7,2,3,9,28,11};

        BubbleSort01 bubbleSort01=new BubbleSort01();
        bubbleSort01.bubble(arr,0);




    }
}
