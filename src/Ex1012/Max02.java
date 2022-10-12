package Ex1012;

import java.util.Arrays;
import java.util.Scanner;

public class Max02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int[][] arr = new int[9][9];
//        int [] arr = new int[] {1,2,3};
        int max=0;
        int max_i=0;
        int max_j=0;

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                arr[i][j]=input.nextInt();

                if (max<arr[i][j]){
                    max=arr[i][j];
                    max_i=i;
                    max_j=j;
                }

            }
        }

        System.out.println(max);
        System.out.printf("%d %d",max_i+1,max_j+1);

    }
}
