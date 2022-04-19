package Calc_OOP.operationsNew;

public class OperationsNew {


    private double firstNumber;
    private double secondNumber;
    double answer;

    public OperationsNew(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double goAnswerSum(double firstNumber, double secondNumber) {
        answer = firstNumber + secondNumber;
        return answer;
    }

    public double goAnswerSub(double firstNumber, double secondNumber) {
        answer = firstNumber - secondNumber;
        return answer;
    }

    public double goAnswerMul(double firstNumber, double secondNumber) {
        answer = firstNumber * secondNumber;
        return answer;
    }

    public double goAnswerDiv(double firstNumber, double secondNumber) {
        answer = firstNumber / secondNumber;
        return answer;
    }

}
