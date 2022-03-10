import java.util.Scanner;

public class Calc_1 {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            float X,Y;
            String operation;
            System.out.println("Введите число №1");
            X = in.nextInt();
            System.out.println("Введите число №2");
            Y = in.nextInt();
            in.nextLine(); //очистка сканера

            System.out.println("Введите одну из операций: ‘+’, ‘-’, ‘*’ или ‘/’.");
            operation = in.nextLine();
            switch (operation) {
                case "+": System.out.println(X+Y);
                    break;
                case "-": System.out.println(X-Y);
                    break;
                case "*": System.out.println(X*Y);
                    break;
                case "/":
                    if (Y == 0) { // Проверка деления на 0
                        System.out.println("На 0 делить нельзя!");
                    }
                    else {
                        System.out.println(X/Y);
                    }
                    break;
                default:
                    break;
            }
        }
    }
