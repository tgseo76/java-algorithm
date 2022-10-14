package Ex1014;

import java.util.Scanner;

public class CodeUpIs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                int tem = 0;
                if (arr[j] < arr[j - 1]) {
                    tem = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tem;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}