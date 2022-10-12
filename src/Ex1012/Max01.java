package Ex1012;

import java.util.Scanner;

public class Max01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] arr = new int[9];
        int max =0;
        int max_index=0;
        for (int i=0;i<9;i++){
            arr[i]=input.nextInt();

            if(max<arr[i]){
                max=arr[i];
                max_index=i;
            }
        }
        System.out.println(max);
        System.out.println(max_index+1);

    }
}
