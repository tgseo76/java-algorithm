package Ex1021;

import java.util.Scanner;
import java.util.Stack;

class StackChallenge {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')') {
                if(st.empty()) return false;
                st.pop();
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='['){
                st1.push(s.charAt(i));
            }else if(s.charAt(i)==']') {
                if(st1.empty()) return false;
                st1.pop();
            }
        }

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='{'){
                st2.push(s.charAt(i));
            }else if(s.charAt(i)=='}') {
                if(st2.empty()) return false;
                st2.pop();
            }
        }
        if (st.isEmpty()==st1.isEmpty()==st2.isEmpty()==true){
            return true;
        }else return false;
    }


    public static void main(String[] args) {
        StackChallenge sol = new StackChallenge();
        Scanner input=new Scanner(System.in);

        String a = input.next();
        System.out.println(sol.solution(a));
    }
}
