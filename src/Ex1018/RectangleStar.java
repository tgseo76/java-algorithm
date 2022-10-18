package Ex1018;

import java.util.Scanner;

public class RectangleStar {
    void rectangleStarMatrix(int x, int y){
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        RectangleStar rectangleStar=new RectangleStar();
        rectangleStar.rectangleStarMatrix(a,b);


    }
}
