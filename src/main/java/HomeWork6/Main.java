package HomeWork6;

import HomeWork6.utils.DataPrintHelper;

/**
 * @author Alexander Krasnov
 * @see DataPrintHelper for easy printing info about data in file
 * @see HomeWork6.getData.FileInputHandler for more about getData from file
 * @see HomeWork6.changeData.DataFormatter for more about data manipulation
 * The file.txt with data is located in the src/main/resources directory
 */
public class Main {
    public static void main(String[] args) {
        DataPrintHelper.printDataFromFile();
        DataPrintHelper.printSortedWordsFromFile();
        DataPrintHelper.printContWordsFromFile();
        DataPrintHelper.printMaxPopularWordFromFile();
    }
}
