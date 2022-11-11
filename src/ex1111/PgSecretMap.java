package ex1111;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/17681
구현방법
1. 입력받은 숫자를 2진법으로 변환
2. 같은 인덱스 별로 ||연산
3. replace로 1==# 0==' '로 바꾸기
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PgSecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        List<Integer> newArr1=new ArrayList<>();
        String[] answer=new String[n];

        for (int i = 0; i < n; i++) {
            newArr1.add(arr1[i]|arr2[i]); //[31, 21, 29, 19, 31]
            String a =Integer.toBinaryString(newArr1.get(i));
            String b = "0".repeat(n-a.length())+a;
            b=b.replace('1','#');
            b=b.replace('0',' ');
            answer[i]=b;
        }
        return answer;
    }

    public static void main(String[] args) {
        int n=5;
        int[] arr1 = {9,20,28,18,11};
        int[] arr2 = {30,1,21,17,28};
        List<Integer> newArr1=new ArrayList<>();
        String[] answer=new String[n];

        for (int i = 0; i < n; i++) {
            newArr1.add(arr1[i]|arr2[i]); //[31, 21, 29, 19, 31]
            String a =Integer.toBinaryString(newArr1.get(i));
            String b = "0".repeat(n-a.length())+a;
            b=b.replace('1','#');
            b=b.replace('0',' ');
            answer[i]=b;
        }

        System.out.println(Arrays.toString(answer));






    }
}
