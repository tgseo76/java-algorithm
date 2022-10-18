package Ex1018;

import java.util.Scanner;

public class SquareStar2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (i==0 || i==n-1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }else {
                System.out.print("*");
                for (int j = 0; j < n-2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }

        }
    }
}
