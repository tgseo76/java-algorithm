package ex1123;

import java.util.Scanner;

public class Star {
    public static void star(int n ){
        if(n==0) return;
        System.out.print("*");
        star(n-1);

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        star(n);


    }
}
