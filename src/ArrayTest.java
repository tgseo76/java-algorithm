import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        System.out.print("금액을 넣으세요:[숫자입력] ");
//        int money=input.nextInt();
//        int[] don = {50000,10000,5000,1000,500,100,50,10};
//
//        for (int i=0;i<don.length;i++){
//            int cnt=0;
//
//            cnt=money/don[i];
//            money=money-(don[i]*cnt);
//
//            System.out.println(don[i]+"원"+cnt+"개");
        int c50000=50000;
        int c10000=10000;
        int c5000=5000;
        int c1000=1000;
        int c500=500;
        int c100=100;
        int c50=50;
        int c10=10;

        int money=213281;

        System.out.printf("5만원 개, 나머지 %d %d \n",money/c50000,money%c50000);
        money%=c50000;
        System.out.printf("1만 개, 나머지 %d %d \n",money/c10000,money%c10000);
        money%=c10000;
        System.out.printf("5천원 개, 나머지 %d %d\n",money/c5000,money%c5000);
        money%=c5000;
        System.out.printf("1천원 개, 나머지 %d %d\n",money/c1000,money%c1000);
        money%=c1000;
        System.out.printf("500원 개, 나머지 %d %d\n",money/c1000,money%c1000);
        money%=c500;
        System.out.printf("100원 개, 나머지 %d %d\n",money/c100,money%c100);
        money%=c100;






    }

    }

