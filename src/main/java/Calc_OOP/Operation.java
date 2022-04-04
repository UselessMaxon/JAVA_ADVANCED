package Calc_OOP;

public abstract class Operation {

    private char charOperation;
    private double firstNumber;
    private double secondNumber;
    double answer;

    public Operation(char charOperation, double firstNumber, double secondNumber) {
        this.charOperation = charOperation;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public char getCharOperation() {
        return charOperation;
    }

    public void setCharOperation(char charOperation) {
        this.charOperation = charOperation;
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

    public double goAnswer(double firstNumber, double secondNumber) {
        return answer;
    }



}



