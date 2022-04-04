package Calc_OOP;
import Calc_OOP.operations.MultiOpertaion;
import Calc_OOP.operations.SubOperation;
import Calc_OOP.operations.SumOperation;
import Calc_OOP.operations.DivOperation;

public class WhatOperation {

    double answer;
    public double whatOperation(char operation, double X, double Y) {

        switch (operation) {
            case '+':
                SumOperation sum = new SumOperation(X,Y);
                answer = sum.goAnswer(sum.getFirstNumber(), sum.getSecondNumber());
                break;
            case '-':
                SubOperation sub = new SubOperation(X,Y);
                answer = sub.goAnswer(sub.getFirstNumber(), sub.getSecondNumber());
                break;
            case '*':
                MultiOpertaion multi = new MultiOpertaion(X,Y);
                answer = multi.goAnswer(multi.getFirstNumber(), multi.getSecondNumber());
                break;
            case '/':
                 DivOperation div = new DivOperation(X,Y);
                 answer = div.goAnswer(div.getFirstNumber(), div.getSecondNumber());
                 break;

            default:
                break;
        }

        return answer;
    }


}