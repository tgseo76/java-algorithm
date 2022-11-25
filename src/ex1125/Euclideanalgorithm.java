package ex1125;

public class Euclideanalgorithm {
    public static int gcd(int a,int b){
        if (a>b) {
            return gcd(a-b,b);
        } else if (a<b) {
            return gcd(a,b-a);
        }else {
            return a;
        }
    }

    public static int newgcd(int p, int q)
    {
        if (q == 0) return p;
        return gcd(q, p%q);
    }

    public static void main(String[] args) {
        System.out.println(gcd(196,42));

        System.out.println(newgcd(3,6));

    }
}
