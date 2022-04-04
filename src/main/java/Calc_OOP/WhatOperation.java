package Calc_OOP;
import Calc_OOP.operations.MultiOpertaion;
import Calc_OOP.operations.SubOperation;
import Calc_OOP.operations.SumOperation;
import Calc_OOP.operations.DivOperation;

public class WhatOperation {

    double ss;
    public double whatOperation(char plus, double fi, double se) {

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

        return ss;
}
}