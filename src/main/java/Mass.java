import java.util.Scanner;

public class Mass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        System.out.println("Выберите задачу: 1 - Калькулятор, 2 - Массив");
//        byte numberTask = in.nextByte();

        byte numberTask = 2;

        System.out.println("Введите размер массива");
        int size = in.nextInt();
        String[] array = new String[size];
        in.nextLine(); // Очистка сканера

//      Ввели с консоли данные в массив array
        for (int i = 0; i < size; i++) {
            System.out.println("Введите слово № " + (i+1) + " из " + size);
            array [i] = in.nextLine();
        }

//      Создан массив lenMass в котором длина слов массива
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

        System.out.println(array[numberMaxPosition]);
    }
}
