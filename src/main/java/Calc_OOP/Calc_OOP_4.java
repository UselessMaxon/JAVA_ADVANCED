package Calc_OOP;

public class Calc_OOP_4 {
    public static void main(String[] args) {

    char plus = '+';
    double fi = 4;
    double se = 46;

        switch (plus) {
            case '+':
                SumOperation op = new SumOperation(fi,se);
                double ss = op.goAnswer(op.getFirstNumber(), op.getSecondNumber());
                System.out.println(ss);
                break;
            case '-': int ff =33;
                break;
            case '*': int fz = 45;
                break;
            default:
                break;
        }





    }
}
