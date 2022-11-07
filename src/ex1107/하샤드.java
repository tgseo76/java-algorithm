package ex1107;

import java.util.Scanner;

public class 하샤드 {

    public boolean solution(int x) {
        boolean answer = true;
        int y =x;
        int num=0;
        while(x!=0) {
            num += x % 10;
            x /= 10;
        }
        if(y%num==0) {
            return true;
        }else {
            return answer = false;
        }

    }
}
