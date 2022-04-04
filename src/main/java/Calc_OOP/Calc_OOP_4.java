package Calc_OOP;

import Calc_OOP.operations.MultiOpertaion;
import Calc_OOP.operations.SubOperation;
import Calc_OOP.operations.SumOperation;
import Calc_OOP.operations.DivOperation;


public class Calc_OOP_4 {


    public static void main(String[] args) {

    char plus = '+';
    double fi = 4;
    double se = 46;
    double ss;

        switch (plus) {
            case '+':
                SumOperation sum = new SumOperation(fi,se);
                ss = sum.goAnswer(sum.getFirstNumber(), sum.getSecondNumber());
                break;
            case '-':
                SubOperation sub = new SubOperation(fi,se);
                ss = sub.goAnswer(sub.getFirstNumber(), sub.getSecondNumber());
                break;
            case '*':
                MultiOpertaion multi = new MultiOpertaion(fi,se);
                ss = multi.goAnswer(multi.getFirstNumber(), multi.getSecondNumber());
                break;
            case '/':
                 DivOperation div = new DivOperation(fi,se);
                 ss = div.goAnswer(div.getFirstNumber(), div.getSecondNumber());
                 break;

            default:
                break;
        }


   //     System.out.println(ss);


    }
}
