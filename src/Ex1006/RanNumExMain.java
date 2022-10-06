package Ex1006;

import java.util.HashSet;

public class RanNumExMain {
    public static void main(String[] args) {
        RanNumEx ranNumEx=new RanNumEx();

        HashSet<Character> numbers = new HashSet<>();
        for(int i=0;i<30;i++){
            char r;
            int num=(int)(Math.random()*(26)+65);
            r = (char)num;
            numbers.add(r);
        }

        System.out.println(numbers);
        System.out.println(numbers.size());


    }
}
