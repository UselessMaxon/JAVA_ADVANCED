package Calc_OOP.operations;

public class MultiOpertaion extends Operation {

    public MultiOpertaion(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double goAnswer(double firstNumber, double secondNumber) {
        answer = firstNumber * secondNumber;
        return answer;
    }
}