import java.util.Arrays;

public class Mass_new_3 {
    public static void main(String[] args) {

        int[] mass = new int[20];

        int min = mass[0];
        int numMin = 0;
        int max = mass[0];
        int numMax = 0;
        int counter = 0;

        while (counter < mass.length) {
            int rnd = (int) (Math.random() * 21) - 10;
            mass[counter] = rnd;

            if (mass[counter] > max) {
                max = mass[counter];
                numMax = counter;
            }

            else if (mass[counter] < min) {
                min = mass[counter];
                numMin = counter;
            }

            counter++;
        }

        System.out.println(Arrays.toString(mass));
        System.out.println("Максимальный элемент массива: " + max + " Индекс №: " + numMax);
        System.out.println("Минимальный элемент массива: " + min + " Индекс №: " + numMin);

        int temp = mass[numMin];
        mass[numMin] = mass[numMax];
        mass[numMax] = temp;


        System.out.println("---------- \nМассив, после перестановки элементов: \n" + Arrays.toString(mass));

        counter = 0;
        min = 0;
        max = 0;
        while (counter < mass.length) {
            if (mass[counter] > max) {
                max = mass[counter];
                numMax = counter;
            }

            else if (mass[counter] < min) {
                min = mass[counter];
                numMin = counter;
            }

            counter++;
        }

        System.out.println("Максимальный элемент массива после перестановки: " + max + " Индекс №: " + numMax);
        System.out.println("Минимальный элемент массива после перестановки: " + min + " Индекс №: " + numMin);
    }
}

