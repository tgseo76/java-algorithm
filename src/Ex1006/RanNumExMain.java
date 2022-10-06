package Ex1006;

import java.util.HashSet;

public class RanNumExMain {
    public static void main(String[] args) {
        RanNumEx ranNumEx=new RanNumEx();

        HashSet<Integer> numbers = new HashSet<>();
        for(int i=0;i<100;i++){
            int r = ranNumEx.gen(20);
            numbers.add(r);
        }

        System.out.println(numbers);
        System.out.println(numbers.size());


    }
}
