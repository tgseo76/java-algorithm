package ex1101;

interface Stmt{
    boolean compare(int a,int b);
}

public class TemCallback {
    boolean someOperation(int a, int b){
        return a<b;
    }

    boolean isPrime(int num,Stmt stmt){
        for (int i = 2; stmt.compare(i,num); i++) {
            System.out.println(i);
            if(num%i==0) return false;
        }
        return true;
    }

//    boolean isPrime(int num){
//        for (int i = 2; someOperation(i,num); i++) {
//            if(num%i==0) return false;
//        }
//        return true;
//    }


    //    boolean isPrime(int num){
//        for (int i = 2; i<num); i++) {
//            if(num%i==0) return false;
//        }
//        return true;
//    }

    public static void main(String[] args) {
        TemCallback tcp = new TemCallback();
        System.out.println(tcp.isPrime(2,((a,b)->a*a<b)));
    }
}



