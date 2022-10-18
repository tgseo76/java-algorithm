package Ex1018;

import java.util.Scanner;

public class RecursiveStar {
    public void rs(int a,int b){
        if (a==b+1){
            return ;
        }
        else {
            System.out.println("*".repeat(a));
            rs(a+1,b);
        }
    }
    public static void main(String[] args) {
        RecursiveStar rs=new RecursiveStar();
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        rs.rs(1,n);




    }
}
