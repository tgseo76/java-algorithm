package ex1110;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class 같은숫자는싫어 {
    public int[] noStack(int []arr) {
        List<Integer> arr2=new ArrayList<>();

        arr2.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if(arr[i-1]!=arr[i]){
                arr2.add(arr[i]);
            }
        }

        int[] answer = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
            answer[i]=arr2.get(i);
        }
        return answer;
    }

    public int[] useStack(int []arr) {
Stack<Integer> arr2=new Stack<>();
        arr2.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
        arr2.push(arr[i]);
        if (arr[i-1]==arr[i]){
            arr2.pop();
        }
    }
    int[] answer = new int[arr2.size()];
        for (int i = 0; i < arr2.size(); i++) {
        answer[i]=arr2.get(i);
    }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {4,4,4,3,3};


    }
}
