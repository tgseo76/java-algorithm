package Ex1021;

import java.util.Stack;

class SolutionYesStack {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='('){
                st.push(s.charAt(i));
            }else if(s.charAt(i)==')') {
                if(st.empty()) return false;
                st.pop();
            }
        }

        return st.isEmpty();
    }


//    public static void main(String[] args) {
//        Solution sol = new Solution();
//        Scanner input=new Scanner(System.in);
//
//        String a = input.next();
//        System.out.println(sol.solution(a));
//    }
}