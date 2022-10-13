import java.util.Scanner;
public class Solution {
    public String solution(int n) {
        int cnt = 1;
        String answer="";
        while(cnt<n+1){
            if(cnt%2==1){
                answer+="수";
            }else {
                answer+="박";
            }

            cnt++;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.solution(n));
    }
}
