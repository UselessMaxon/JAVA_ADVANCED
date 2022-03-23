import java.util.Scanner;

public class Task2_OperationCalc {

    /**
     * Simple calculator for four types operation: "+" , "-" , "*" , "/"
     * Finding the longest word in an array
     * with console output
     * @author Maks Chistyakov
     * @return void
     */


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Выберите задачу: 1 - Калькулятор, 2 - Массив");
        int numberTask = in.nextInt();

        if (numberTask == 1) {
            // Запускаем калькулятор если в консоль введена 1

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


        else if (numberTask == 2) {
            // Если введена 2, то запускаем массив

            System.out.println("Введите размер массива");
            int size = in.nextInt();
            String[] array = new String[size];
            in.nextLine(); // Очистка сканера

            // Ввели с консоли данные в массив array
            for (int i = 0; i < size; i++) {
                System.out.println("Введите слово № " + (i+1) + " из " + size);
                array [i] = in.nextLine();
            }

            // Создан массив lenMass в котором длина слов массива
            int[] lenMass = new int [size];
            for (int i = 0; i < array.length; i++) {
                lenMass[i] = array[i].length();
            }

            int numberMaxPosition = 0;
            for (int i = 1, maxN = lenMass[0]; i < lenMass.length; i++) {
                if (lenMass[i] > maxN) {
                    maxN = lenMass[i];
                    numberMaxPosition = i;
                }
            }

            System.out.println("Самое длинное слово в массиве: "+ array[numberMaxPosition]);
        }

        // Если введено не 1 и не 2, принтанется ошибка
        else {
            System.err.println("Несуществующая задача");
        }

        in.close();


    }
}
