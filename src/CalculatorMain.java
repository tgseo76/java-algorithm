public class CalculatorMain {
    public static void main(String[] args) {
        RandomCalculator rc = new RandomCalculator(5);

        System.out.println(rc.plus());
        System.out.println(rc.minus());
        System.out.println(rc.multiple());


        if (rc.b==0){
            System.out.println("랜덤하게 생선된 숫자가 0입니다.");
        } else{
            System.out.println(rc.divide());
        }
    }
}
