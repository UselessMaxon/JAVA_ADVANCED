import java.util.Scanner;

/**
 * Simple calculator for four types operation: "+" , "-" , "*" , "/"
 * with console output
 * @author Maks Chistyakov
 * @return void
 */

public class Calc_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Double X,Y;
        String operation;
        System.out.println("Введите число №1");
        X = in.nextDouble();
        System.out.println("Введите число №2");
        Y = in.nextDouble();
        in.nextLine(); // Очистка сканера

        System.out.println("Введите одну из операций: ‘+’, ‘-’, ‘*’ или ‘/’.");
        operation = in.nextLine();
        switch (operation) {
            case "+": System.out.printf("%.4f", X+Y);
                break;
            case "-": System.out.printf("%.4f", X-Y);
                break;
            case "*": System.out.printf("%.4f", X*Y);
                break;
            case "/":
                if (Y == 0) { // Проверка деления на 0
                    System.err.println("На 0 делить нельзя!");
                }
                else {
                    System.out.printf("%.4f", X/Y);
                }
                break;
            default:
                System.err.println("Введите корректную операцию"); // Вывод в консоль, если символ введен некорректный
                break;
        }
    }
}
