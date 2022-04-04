package Calc_OOP;

import java.util.Scanner;

public class Calc_OOP_MAIN_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double X,Y;
        char operation;
        System.out.println("Введите число №1");
        X = in.nextDouble();
        System.out.println("Введите число №2");
        Y = in.nextDouble();
        in.nextLine(); // Очистка сканера

        System.out.println("Введите одну из операций: ‘+’, ‘-’, ‘*’ или ‘/’.");
        operation = (in.nextLine()).charAt(0);

        WhatOperation ready = new WhatOperation();
        double answer= ready.whatOperation(operation, X, Y);

        System.out.print("Ответ: ");
        System.out.printf("%.4f", answer);

        in.close();
    }
}
