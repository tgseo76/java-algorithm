package ex1130;

import java.util.Scanner;

public class Node {
//    public static int node(int a){
//        if (a==1) return 0;
//        else {
//            return 1+node(a/2);
//        }

    public static int goup(int a,int b){
        if(a>b){
            return goup(a/2,b)+1;
        } else if (a<b) {
            return goup(a,b/2)+1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(goup(a,b));
//        System.out.println(node(a)-node(b));

    }
}
