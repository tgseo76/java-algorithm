package Ex1017;

import java.util.Scanner;

public class RightTriangle {
    void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    void printNew(int n,char c){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c",c);
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {
        RightTriangle rightTriangle = new RightTriangle();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char c = input.next().charAt(0);
//        rightTriangle.print(n);
        rightTriangle.printNew(n,c);


    }
}


