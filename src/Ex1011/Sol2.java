package Ex1011;

import java.util.Scanner;

public class Sol2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        int cnt=0;
        while (n!=0){
            n=n/10;
            cnt++;
        }

        System.out.println(cnt);
    }
}
