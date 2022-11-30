package ex1130;

public class Yak {
    public static int solution(int n) {
        int hap=0;
        for (int i = 1; i <= n; i++) {
            if (n%i==0){
               hap+=i;
            }
        }
        return hap;
    }
    public static void main(String[] args) {
        System.out.println(solution(12));


    }
}
