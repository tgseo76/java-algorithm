import java.util.Scanner;

public class EvenOdd {

    public static String getEvenOdd(int num){
        if (num%2==0){
            return "짝수";
        } else{
            return "홀수";
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int a=input.nextInt();

        System.out.println(getEvenOdd(a));
        System.out.println("+");

        int b=input.nextInt();
        System.out.println(getEvenOdd(b));
        System.out.println("=");
        int c=a+b;
        System.out.println(getEvenOdd(c));

//        if (a%2==0){
//            System.out.print("짝수");
//            System.out.print("+");
//        }
//        else {
//            System.out.print("홀수");
//            System.out.print("+");
//        }


//        int b=input.nextInt();
//
//
//        if (b%2==0){
//            System.out.print("짝수");
//        }
//        else {
//            System.out.print("홀수");
//        }
//
//        System.out.print("=");
//
//        if ((a+b)%2==0){
//            System.out.print("짝수");
//        }
//        else {
//            System.out.print("홀수");
//        }

    }
}
