package ex1201;

import java.util.*;

import static java.util.Collections.list;
import static java.util.Collections.reverseOrder;

public class Score {
    public int[] solution(int k, int[] score) {
        List<Integer> arr= new ArrayList<>();
        int[] answer=new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if (i<k) {
                arr.add(score[i]);
                arr.sort(Comparator.naturalOrder());
                System.out.println(arr);
                answer[i] = arr.get(0);
            }else {
                arr.add(score[i]);
                arr.sort(Comparator.reverseOrder());
                answer[i]=arr.get(k-1);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
//        int k=4;
//        int[] score={0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
//        List<Integer> arr= new ArrayList<>();
//        int[] answer=new int[score.length];
//
//        for (int i = 0; i < score.length; i++) {
//            if (i<k) {
//                arr.add(score[i]);
//                arr.sort(Comparator.naturalOrder());
//                System.out.println(arr);
//                answer[i] = arr.get(0);
//            }else {
//                arr.add(score[i]);
//                arr.sort(Comparator.reverseOrder());
//                answer[i]=arr.get(k-1);
//            }
//        }
//        System.out.println(Arrays.toString(answer));

    }

}
