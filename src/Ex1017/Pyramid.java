package Ex1017;

import java.util.Scanner;

public class Pyramid {
    int n;

    void pyramid(int n){

        for (int i = 0; i < n; i++) {

            for (int j = i; j < n-1; j++) {
                System.out.print(" ");
            }

            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }





    public static void main(String[] args) {
        Pyramid pyramid=new Pyramid();
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        pyramid.pyramid(n);

    }
}
