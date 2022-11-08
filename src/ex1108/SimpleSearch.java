package ex1108;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimpleSearch {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); // --> 첫번째 숫자 10
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int q= sc.nextInt();
            numbers.add(q);
        }
        int k = sc.nextInt();

        if (numbers.indexOf(k)>-1){
            System.out.println(numbers.indexOf(k)+1);
        }else{
            System.out.println(numbers.indexOf(k));
        }



    }

}
