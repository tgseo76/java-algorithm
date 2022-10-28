package ex1028;

import java.util.HashSet;
import java.util.Set;

public class Pokemon {
    public int solution(int[] nums) {
        int answer = 0;
        int a = nums.length / 2; // a= 고를수있는 갯수 ==3

        Set<Integer> num1 = new HashSet<>(); //[3,2,4]
        for (int i = 0; i < nums.length; i++) {
            num1.add(nums[i]);
        }

        if (a > num1.size()) {
            answer=num1.size();
        } else {
            answer=a;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}

//a==5  size==6