package Calc_OOP;

public class SumOperation extends Operation {

    public SumOperation(char charOperation, double firstNumber, double secondNumber) {
        super(charOperation, firstNumber, secondNumber);
    }

    @Override
    public double goAnswer(double firstNumber, double secondNumber) {
        answer = firstNumber + secondNumber;
        return answer;
    }
}
