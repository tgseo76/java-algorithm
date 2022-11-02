package ex1102;

import java.util.ArrayList;
import java.util.List;

public class 에라토스테네스의체 {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 2; i <51; i++) {
            arr.add(i);
        }

        for (int i = 2; i <= 51; i++) {
            arr.remove(Integer.valueOf(i*2));
        }

        System.out.println(arr.size());
        System.out.println(arr);


    }
}
