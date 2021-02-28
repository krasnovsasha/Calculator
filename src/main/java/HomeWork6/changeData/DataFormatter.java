package HomeWork6.changeData;

import HomeWork6.getData.FileInputHandler;

import java.util.*;


/**
 * @author Alexander Krasnov
 */
public class DataFormatter {
    private String[] words;
    private List<String> arrList;
    private Map<String, Integer> tm;

    private List<String> getListFromFile() {
        words = FileInputHandler.getDataFromFile().toString().replaceAll("\\p{Punct}", " ").split("\\s+");
        arrList = new ArrayList<>(Arrays.asList(words));
        return arrList;
    }

    public String getStringFromFile() {
        return String.valueOf(FileInputHandler.getDataFromFile());
    }

    public List<String> sort() {
        Collections.sort(getListFromFile());
        arrList.forEach(System.out::println);
        return getListFromFile();
    }

    public void countWords() {
        tm = new TreeMap<>();
        for (String s : getListFromFile()) {
            tm.put(s, tm.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> pair : tm.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public void findMaxPopularWord() {
        int count = 0;
        tm = new TreeMap<>();
        for (String s : getListFromFile()) {
            tm.put(s, tm.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String, Integer> pair : tm.entrySet()) {
            if (count < pair.getValue()) count = pair.getValue();
        }
        for (Map.Entry<String, Integer> pair : tm.entrySet()) {
            if (pair.getValue() == count) System.out.println(pair.getKey() + " - " + count);
        }
    }
}
