package ex1201;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        int number=10;
        int limit=3;
        int power=2;
        int answer =0;

        for (int i = 1; i < number+1; i++) {
            int cnt=0;
            for (int j = 1; j < (int)Math.sqrt(i)+1; j++) {
                if(i%j==0){
                    cnt+=1;
                    if(Math.pow(j,2)!=i){
                        cnt+=1;
                    }
                }
            }
            arr.add(cnt);
        }

        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)<=limit){
                answer+=arr.get(i);
            }else {
                arr.set(i,power);
                answer+=arr.get(i);
            }
        }
        System.out.println(answer);



    }
}
