package Ex1005;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int plus(){
        return a+b;
    }

    int minus(){
        return a-b;
    }

    int multiple(){
        return a*b;
    }

    float divide(){
        return (float)a/b;
    }
}
