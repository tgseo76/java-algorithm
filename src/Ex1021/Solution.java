package Ex1021;

import java.util.Scanner;

class Solution {
    boolean solution(String s) {
        int cnt=0;
        boolean answer=true;

        if (s.charAt(0) == ')') {
            answer = false;
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(cnt==0 && c==')'){
                return false;
            }else if (c == '(') {
                cnt += 1;

            } else if (c == ')') {
                cnt -= 1;
            }
            }

        if (cnt == 0) {
            answer = true;
        } else {
            answer = false;
        }

        if (s.charAt(s.length()-1) == '(') {
            answer = false;
        }


        return answer;
    }
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        Scanner input=new Scanner(System.in);
//
//        String a = input.next();
//        System.out.println(sol.solution(a));
//    }

}
