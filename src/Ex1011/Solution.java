package Ex1011;

import java.util.*;
public class Solution {
        public int solution(int n) {
            int i=0;
            int answer = 0;
            int sum=0;
            while (i<9){
                answer+=(n%10);
                n=n/10;
                i++;
            }

            return answer;
        }

    public static void main(String[] args) {

    }
    }

