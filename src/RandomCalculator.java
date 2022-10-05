public class RandomCalculator {

    int a;
    int b=(int)(Math.random()*10);

    public RandomCalculator(int a) {
        this.a = a;
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
