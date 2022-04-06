package Collections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Collections_Main_5 {


    public static void  readFile() {

        Collection<String> allWord = new ArrayList<String>();

        File file1 = new File("src/main/java/Collections/notes.txt");
        try {
            Scanner reader = new Scanner(file1);

            while (reader.hasNext()) {
                allWord.add(reader.next());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(allWord);
        //return allWord;
    }

    /*   public Collection sortAlphabet(){

       }

       public Collection counterUniq() {

       }

       public void statisticUniq() {
           System.out.println();
       }

       public Collection wordMaxRepeat() {

       }


   */
    public static void main(String[] args) {

        System.out.println("Файл должен находиться: src/main/java/Collections/notes.txt \n----------------");
        System.out.println();
        readFile();




        //set что бы прочитат слова
        // мап, кеу это слово, а valuev это кол-во знаков.

        }
    }

