package Calc_OOP;

public class Calc_OOP_4 {
    public static void main(String[] args) {

    char plus = '+';
    double fi = 4;
    double se = 46;

    SumOperation op = new SumOperation(plus,fi,se);

    double ss = op.goAnswer(op.getFirstNumber(), op.getSecondNumber());
        System.out.println(ss);

    }
}
