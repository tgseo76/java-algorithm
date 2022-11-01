package ex1101;

public class PrimeNumber {


    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,13,17,18,19};

//2번방법
                for (int i = 0; i < arr.length; i++) {
            int cnt=0;
            for (int j = 2; j <= arr[i]/2; j++) {
                if(arr[i]%j!=0){
                }else {
                    cnt+=1;
                }
            }
            if (cnt>0){
                System.out.printf("%d = 소수가 아닙니다\n",arr[i]);
            }else {
                System.out.printf("%d = 소수\n",arr[i]);
            }

        }









//        //1번방법
//        for (int i = 0; i < arr.length; i++) {
//            int cnt=0;
//            for (int j = 2; j < arr[i]; j++) {
//                if(arr[i]%j!=0){
//                }else {
//                    cnt+=1;
//                }
//            }
//            if (cnt>0){
//                System.out.println("소수가 아닙니다");
//            }else {
//                System.out.println("소수입니다");
//            }
//
//        }
    }
}
