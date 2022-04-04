package Calc_OOP;

public class SumOperation extends Operation {

    public SumOperation(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double goAnswer(double firstNumber, double secondNumber) {
        answer = firstNumber + secondNumber;
        return answer;
    }
}