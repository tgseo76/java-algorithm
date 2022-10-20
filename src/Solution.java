import java.util.Scanner;
class Solution {
    public long solution(int a, int b) {
        long answer = 0;

        if(a<=b){
            for (int i = a; i <= b; i++) {
                answer+=i;
            }
        }else {
            for (int i = b; i <= a; i++) {
                answer+=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(sol.solution(a,b));

    }
    }
