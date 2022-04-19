package operations;

public abstract class Operation {


    private double firstNumber;
    private double secondNumber;
    double answer;

    public Operation(double firstNumber, double secondNumber) {
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

    public double goAnswer(double firstNumber, double secondNumber) {
        return answer;
    }

}

