package Calc_OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc_OOP_MAIN_4 {
    public static void main(String[] args) throws IllegalArgumentException {

        Scanner in = new Scanner(System.in);
        double X,Y;
        char operation;

        System.out.println("Введите число №1");
        try {
            X = in.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Введенное значение №1 не является числом!");
            in.close();
            return;
        }

        System.out.println("Введите число №2");
        try {
            Y = in.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("Введенное значение №2 не является числом!");
            in.close();
            return;
        }

        in.nextLine(); // Очистка сканера

        System.out.println("Введите одну из операций: ‘+’, ‘-’, ‘*’ или ‘/’.");
        String tempIn = in.nextLine();
        try {
            if (tempIn.length() > 1) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException re) {
            System.err.println("Должнен быть введен только один символ!" + re);
            return;
        }

        operation = tempIn.charAt(0);

        double answer;
        WhatOperation ready = new WhatOperation();

        try {
            answer = ready.whatOperation(operation, X, Y);
        } catch (IllegalArgumentException n) {
            System.err.println("Произошло деление на ноль! : " + n);
            return;
        } catch (ArithmeticException ar) {
            System.err.println("Введена неверная операция! : " + ar);
            return;
        }

        System.out.print("Ответ: ");
        System.out.printf("%.4f", answer);

        in.close();
    }
}