package Ex1024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class KNum {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int [] answer = new int[commands.length];
        int cnt=0;

        for (int i = 0; i < commands.length; i++) {
            int[] arr1=commands[i]; //[2,5,3]
            ArrayList<Integer> arr2= new ArrayList<>();
            for (int j = arr1[0]-1; j < arr1[1]; j++) {
                arr2.add(array[j]);
            }
            Collections.sort(arr2);
//            System.out.println(arr2);
            answer[cnt++]=arr2.get(arr1[2]-1);
        }

//        System.out.println(Arrays.toString(answer));

//        System.out.println(Arrays.toString(commands[1]));
    }

}
