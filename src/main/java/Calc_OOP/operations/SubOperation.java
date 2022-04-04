package Calc_OOP.operations;

import Calc_OOP.operations.Operation;

public class SubOperation extends Operation {

    public SubOperation(double firstNumber, double secondNumber) {
        super(firstNumber, secondNumber);
    }

    @Override
    public double goAnswer(double firstNumber, double secondNumber) {
        answer = firstNumber - secondNumber;
        return answer;
    }
}