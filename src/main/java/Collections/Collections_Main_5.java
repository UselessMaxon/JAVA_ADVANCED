package Collections;

import javax.lang.model.element.NestingKind;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Collections_Main_5 {


    public static void readFile(File file1) {

        ArrayList<String> allWord = new ArrayList<String>();

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
        Collections.sort(allWord);
        System.out.println(allWord);

        //создание сортед сет
        HashSet<String> allWordSet = new HashSet<String>(allWord);
        System.out.println(allWordSet);

      //  return allWord;



    }

//    public static void sortAlphabet(ArrayList<String> allWord) {

 //       Collections.sort(allWord);
//        System.out.println();
 //   }

    /*   public Collection counterUniq() {

       }

       public void statisticUniq() {
           System.out.println();
       }

       public Collection wordMaxRepeat() {

       }


   */
    public static void main(String[] args) {

        String path = "src/main/java/Collections/notes.txt";
        System.out.println("Файл должен находиться: " + path +
                "\n-----------------------------------------------------------");

        File file1 = new File(path);
        readFile(file1);









        //set что бы прочитат слова
        // мап, кеу это слово, а valuev это кол-во знаков.

        }
    }

