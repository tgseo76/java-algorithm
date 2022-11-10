package ex1110;


import java.util.ArrayList;
import java.util.List;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};
        List<Integer> arr2=new ArrayList<>();

        arr2.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if(arr[i-1]!=arr[i]){
                arr2.add(arr[i]);
            }
        }

        System.out.println(arr2);

    }
}
