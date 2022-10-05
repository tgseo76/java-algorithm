public class CalculatorMain {
    public static void main(String[] args) {
        Calculator cal = new Calculator(5,2);


        System.out.println(cal.plus());
        System.out.println(cal.minus());
        System.out.println(cal.multiple());
        System.out.println(cal.divide());
    }
}
