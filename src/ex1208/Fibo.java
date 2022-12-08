package ex1208;

public class Fibo {
    public int fibo(int n){
        int[] arr = new int[n];

        if(n==1 || n==2){
            return 1;
        }else {
            return fibo(n-2)+fibo(n-1);
        }
    }
    public static void main(String[] args) {
        Fibo fibo = new Fibo();
        System.out.println(fibo.fibo(0));
    }
}
