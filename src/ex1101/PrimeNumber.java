package ex1101;

public class PrimeNumber {
    public static void main(String[] args) {
        int[] arr = {13,17,19,23};

        for (int i = 0; i < arr.length; i++) {
            int cnt=0;
            for (int j = 2; j < arr[i]; j++) {
                if(arr[i]%j!=0){
                    break;
                }else {
                    cnt+=1;
                }
            }
            if (cnt>0){
                System.out.println("소수가 아닙니다");
            }else {
                System.out.println("소수입니다");
            }

        }
    }
}
