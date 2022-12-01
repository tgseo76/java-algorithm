package ex1130;

import static java.lang.Character.toUpperCase;

public class Cnt {
    static boolean solution(String s) {
        int cnt=0;
        for (int i = 0; i < s.length(); i++) {
            char c =toUpperCase(s.charAt(i));
            if(c=='P'){
                cnt+=1;
            } else if (c=='Y') {
                cnt-=1;
            }
        }
        if (cnt==0) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(solution("Pyy"));


    }
}
