package ex1114;

import java.util.Arrays;
import java.util.Collections;

public class 에레토스 {
    public static void main(String[] args) {
        int n=10;
        int cnt=0;
        boolean[] arr = new boolean[n+1]; //false로 채움

        for (int i = 2; i <= Math.sqrt(n); i++) { // 1 2 4 8 16
            if (arr[i]==false){
                for (int j = 2*i; j <= n; j+=i) {
                    arr[j]=true;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==false){
                cnt+=1;
            }

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(cnt-2);

    }
}
