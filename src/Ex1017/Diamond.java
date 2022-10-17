package Ex1017;

import java.util.Scanner;

public class Diamond {
    void diamond(int n){

        for (int i = 0; i < (n/2)+1; i++) {

            for (int j = i; j < (n-1)/2; j++) {
                System.out.print(" ");
            }

            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = (n/2)-1; i >= 0; i--) {
            for (int j = (n-1)/2; j > i; j--) {
                System.out.print(" ");
            }

            for (int k=0;k<i+1;k++){
                System.out.print("* ");
            }
            System.out.println();

        }


    }

    public static void main(String[] args) {
        Diamond diamond=new Diamond();
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        diamond.diamond(n);
    }
}
