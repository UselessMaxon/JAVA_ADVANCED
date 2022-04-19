package Calc_OOP;
import Calc_OOP.operationsNew.OperationsNew;

public class WhatOperation {

    double answer;
    public double whatOperation(char operation, double X, double Y) {

        switch (operation) {
            case '+':
                OperationsNew sum = new OperationsNew(X,Y);
                answer = sum.goAnswerSum(sum.getFirstNumber(), sum.getSecondNumber());
                break;
            case '-':
                OperationsNew sub = new OperationsNew(X,Y);
                answer = sub.goAnswerSub(sub.getFirstNumber(), sub.getSecondNumber());
                break;
            case '*':
                OperationsNew multi = new OperationsNew(X,Y);
                answer = multi.goAnswerMul(multi.getFirstNumber(), multi.getSecondNumber());
                break;
            case '/':
                OperationsNew div = new OperationsNew(X,Y);
                answer = div.goAnswerDiv(div.getFirstNumber(), div.getSecondNumber());
                break;

            default:
                break;
        }

        return answer;
    }


}