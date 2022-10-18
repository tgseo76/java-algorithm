package Ex1018;

import java.util.Scanner;

public class SquareStar3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
