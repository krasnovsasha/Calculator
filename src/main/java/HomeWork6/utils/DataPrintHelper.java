package HomeWork6.utils;

import HomeWork6.changeData.DataFormatter;

/**
 * @author Alexander Krasnov
 */
public class DataPrintHelper {

    public static void printDataFromFile(){
        System.out.println("// Data from file:\n");
        System.out.println(new DataFormatter().getStringFromFile());
        System.out.println();
    }

    public static void printSortedWordsFromFile(){
        System.out.println("// Sorted data:\n");
        new DataFormatter().sort();
        System.out.println();
    }

    public static void printContWordsFromFile(){
        System.out.println("// Count word:\n");
        new DataFormatter().countWords();
        System.out.println();
    }

    public static void printMaxPopularWordFromFile(){
        System.out.println("// Max popular word:\n");
        new DataFormatter().findMaxPopularWord();
        System.out.println();
    }
}
