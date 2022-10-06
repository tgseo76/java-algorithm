package Ex1006;

import java.util.HashSet;
import java.util.Set;

public class SetExercise {
    public static void main(String[] args) {
        Set<String> set1=new HashSet<>(); //tree set
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김경록");
        set1.add("김록");


        System.out.println(set1);
    }
}
