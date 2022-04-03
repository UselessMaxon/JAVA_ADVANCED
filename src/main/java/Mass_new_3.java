import java.util.Arrays;

public class Mass_new_3 {
    public static void main(String[] args) {

        int[] mass = new int[20];

        int range = 21;
        int minPositive = 999;
        int numMinPositive = 0;
        int maxNegative = -999;
        int numMaxNegative = 0;
        int counter = 0;


        while (counter < mass.length) {
            int rnd = (int) (Math.random() * range) - (range/2 - 1);
            mass[counter] = rnd;

            if (mass[counter] < 0 && mass[counter] >= maxNegative) {
                maxNegative = mass[counter];
                numMaxNegative = counter;
            }

            else if (mass[counter] > 0 && mass[counter] <= minPositive) {
                minPositive = mass[counter];
                numMinPositive = counter;
            }

            counter++;
        }

        System.out.println(Arrays.toString(mass));

        if (minPositive == 999) {
            System.err.println("Сгенерированный массив не имеет положительного числа");
            System.out.println("Максимальный ОТРИЦАТЕЛЬНЫЙ элемент массива: " + maxNegative + ", Индекс № " + numMaxNegative);
        }

        else if (maxNegative == -999) {
            System.err.println("Сгенерированный массив не имеет отрицательного числа");
            System.out.println("Минимальный ПОЛОЖИТЕЛЬНЫЙ элемент массива: " + minPositive + ", Индекс № " + numMinPositive);
        }

        else {
            System.out.println("Максимальный ОТРИЦАТЕЛЬНЫЙ элемент массива: " + maxNegative + ", Индекс № " + numMaxNegative);
            System.out.println("Минимальный ПОЛОЖИТЕЛЬНЫЙ элемент массива: " + minPositive + ", Индекс № " + numMinPositive);

            int temp = mass[numMinPositive];
            mass[numMinPositive] = mass[numMaxNegative];
            mass[numMaxNegative] = temp;

            System.out.println("---------- \nМассив, после перестановки элементов: \n" + Arrays.toString(mass));

            counter = 0;
            while (counter < mass.length) {

                if (mass[counter] < 0 && mass[counter] >= maxNegative) {
                    maxNegative = mass[counter];
                    numMaxNegative = counter;
                }

                else if (mass[counter] > 0 && mass[counter] <= minPositive) {
                    minPositive = mass[counter];
                    numMinPositive = counter;
                }

                counter++;
            }

            System.out.println("Максимальный ОТРИЦАТЕЛЬНЫЙ после перестановки: " + maxNegative + ", Индекс № " + numMaxNegative);
            System.out.println("Минимальный ПОЛОЖИТЕЛЬНЫЙ после перестановки: " + minPositive + ", Индекс № " + numMinPositive);
        }
    }
}

