package calcul;

public class Main {
    public static void main(String[] args) {

        NumberMaker numberMaker = new RandomNumberMaker();
        Calculator randomNumberCalculator = new Calculator(numberMaker);
        randomNumberCalculator.plus(30);

        Calculator byPassNumberCalculator = new Calculator(new ByPassNumberMaker(),200);
        byPassNumberCalculator.plus(50);
    }
}
