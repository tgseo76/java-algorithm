package ex1128;

import java.util.ArrayList;

public class Combinations {
    public static void main(String[] args) {
        ArrayList<Character> arr = new ArrayList<>();

        char c ;
        for (int i = 97; i < 123; i++) {
            c= (char) i;
            arr.add(c);
        }
        System.out.println(arr);


    }
}
