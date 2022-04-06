package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;
import java.util.Map;

public class Collections_Main_5 {

    public static void readFile(File file1) {

        ArrayList<String> allWord = new ArrayList<String>();

        try {
             Scanner reader = new Scanner(file1);

            while (reader.hasNext()) {
                allWord.add(reader.next());
            }

            reader.close();
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("1) Слова в файле: " + allWord);
        Collections.sort(allWord);
        System.out.println("2) Отсортированные слова в алфавитном порядке: " + allWord);

        HashMap<String, Integer> uniqStatistic = new HashMap<String, Integer>();
        for (String word : allWord) {
            if (!uniqStatistic.containsKey(word)) {
                uniqStatistic.put(word, 1);
            }

            else {
                uniqStatistic.put(word, uniqStatistic.get(word) + 1);
            }
        }
        System.out.println("3) Статистика по количеству встречающихся слов: " + uniqStatistic);

        int maxV = Collections.max(uniqStatistic.values());

        System.out.print("4) Слово (слова) с максимальным количеством повторений: ");
        for (Map.Entry word : uniqStatistic.entrySet()) {
            Object key = word.getKey();
            Object value = word.getValue();
            if ((Integer) value == maxV) {
                System.out.print(key + " = " + value + "   ");
            }
        }
    }

    public static void main(String[] args) {

        String path = "src/main/java/Collections/notes.txt";

        System.out.println("Файл должен находиться: " + path +
                "\n-----------------------------------------------------------");

        File file1 = new File(path);
        readFile(file1);
        }
    }