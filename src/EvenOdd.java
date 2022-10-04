import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a=input.nextInt();

        if (a%2==0){
            System.out.print("짝수");
            System.out.print("+");
        }
        else {
            System.out.print("홀수");
            System.out.print("+");
        }

        int b=input.nextInt();
        if (b%2==0){
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }

        System.out.print("=");

        if ((a+b)%2==0){
            System.out.print("짝수");
        }
        else {
            System.out.print("홀수");
        }

    }
}
