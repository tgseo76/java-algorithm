package calcul;

public class Calculator {
    //numbermaker에서 만들어준 숫자를 가지고 사칙연산한 결과를 출력

    private NumberMaker numberMaker;
    private int baseNum = 10;

    public Calculator(NumberMaker numberMaker) {
        this.numberMaker = numberMaker;
    }

    public Calculator(NumberMaker numberMaker, int baseNum) {
        this.numberMaker = numberMaker;
        this.baseNum = baseNum;
    }

    public void plus(int num){
        int result = num+ this.numberMaker.make(this.baseNum);
        System.out.println(result);
    }

}
