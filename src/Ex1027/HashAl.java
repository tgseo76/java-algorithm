package Ex1027;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashAl {
//    https://school.programmers.co.kr/learn/courses/30/lessons/42576?language=java

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < participant.length; i++) {
            String key = participant[i];
            // 바로 put을 하지 않습니다.
            // 바로 put을 할 수도 없고 숫자를 올리긴 해야겠고
            if (!memo.containsKey(key)) {
                memo.put(key, 0);
            }
            memo.put(key, memo.get(key) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            String key = completion[i]; // value 1
            memo.put(key, memo.get(key) - 1);
        }
        for (String key : memo.keySet()) {
            if (memo.get(key) == 1) {
                return key;
            }
        }


            return "";
    }

        public static void main (String[]args){

        }

}
