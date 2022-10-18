package Ex1018;

import java.util.Scanner;

public class SquareStar {
    void printSquareMatrix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        SquareStar squareStar=new SquareStar();
        squareStar.printSquareMatrix(n);

    }
}
