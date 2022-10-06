package Ex1006;

import java.util.HashSet;

public class RanNumExMain {
    public static void main(String[] args) {
//        RanNumEx ranNumEx=new RanNumEx();
        char r;

        HashSet<Character> numbers = new HashSet<>();
        for(int i=0;i<30;i++){

            int num=(int)(Math.random()*(90-65+1)+65);
            r = (char)num;
            numbers.add(r);
        }

        System.out.println(numbers);
        System.out.println(numbers.size());

    }
}
