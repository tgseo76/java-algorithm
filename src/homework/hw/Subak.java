package homework.hw;

import java.util.Scanner;

public class Subak {
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
            Subak subak = new Subak();
            Scanner input=new Scanner(System.in);
            int n = input.nextInt();
            System.out.println(subak.solution(n));

    }
}