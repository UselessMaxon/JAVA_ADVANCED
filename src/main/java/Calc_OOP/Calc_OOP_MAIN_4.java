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

        WhatOperation ready = new WhatOperation();
        double answer= ready.whatOperation(operation, X, Y);

        System.out.print("Ответ: ");
        System.out.printf("%.4f", answer);

        in.close();
    }
}
