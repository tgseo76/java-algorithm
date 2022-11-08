package ex1108;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        Scanner input=new Scanner(System.in);
        int st = 0;
        int en = nums.length;
        int tg=input.nextInt(); // 타겟값
        // 중간값 찾기
        int mid = (st+en)/2;
        // 인덱스(시작점, 끝점) 옮기기
        if (tg>mid){
            st=mid;
            mid=(st+en)/2;
        }else {
            en=mid;
            mid=(st+en)/2;
        }
        // 같은지 비교하기
    }
}
