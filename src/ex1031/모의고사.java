package ex1031;

import java.util.Arrays;

public class 모의고사 {
////    https://school.programmers.co.kr/learn/courses/30/lessons/42840
//    //    1번 : 1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
////    2번 : 2, 1, 2, 3, 2, 4, 2, 5, 2, 1,
////    3번 : 3, 3, 1, 1, 2, 2, 4, 4, 5, 5,
//
//    /*    패턴
//
//         1번 ((i%5)+1)
//         2번 i%2==0 i=2
//            i%2!=0 i=
//
//       3번
//
//     */
//public int[] solution(int[] answers) {
//
//
//    int[] answer = {};
//
//    return new int[0];
//}


    public static void main(String[] args) {
        /*
        def solution(answers):
    s1 = [1, 2, 3, 4, 5] * 4000
    s2 = [2, 1, 2, 3, 2, 4, 2, 5] * 1250
    s3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] * 1000

    dap = []
    cnt = 0
    redap = []
    for i in range(len(answers)):
        if answers[i] == s1[i]:
            cnt += 1
    dap.append(cnt)

    cnt = 0
    for i in range(len(answers)):
        if answers[i] == s2[i]:
            cnt += 1
    dap.append(cnt)

    cnt = 0
    for i in range(len(answers)):
        if answers[i] == s3[i]:
            cnt += 1
    dap.append(cnt)

    if dap.count(max(dap)) == 1:
        for i in range(len(dap)):  # dap.index(max(dap) 이면 +1해서 출력
            if dap[i] == max(dap):
                redap.append(i + 1)

        return(redap)
    else:
        for i in range(len(dap)):  # dap.index(max(dap) 이면 +1해서 출력
            if dap[i] == max(dap):
                redap.append(i + 1)

        return(redap)

         */

//    String s1="12345".repeat(2000);
//        String s2="21232425".repeat(1250);
//        String s3="3311224455".repeat(1000);
//        int[] answer = {1,3,2,4,2};
//        int cnt=0;
//        int[] cntStudnet ={0,0,0};
//        int[] arr = {1,2,3,4,5};
//
//        for (int i = 0; i < answer.length; i++) {
//            int v = Character.getNumericValue(s1.charAt(i));
//            if(Character.getNumericValue(s1.charAt(i))==answer[i])cntStudnet[0]++;
//            if(Character.getNumericValue(s2.charAt(i))==answer[i])cntStudnet[1]++;
//            if(Character.getNumericValue(s3.charAt(i))==answer[i])cntStudnet[2]++;
//        }
//        System.out.println(Arrays.toString(cntStudnet));

    }

}
