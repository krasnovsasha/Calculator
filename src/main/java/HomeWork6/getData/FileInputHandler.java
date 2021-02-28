package HomeWork6.getData;

import java.io.*;

/**
 * @author Alexander Krasnov
 */
public class FileInputHandler {
   private static BufferedReader br = null;
   private static StringBuilder sb = new StringBuilder();

   public static StringBuilder getDataFromFile(){
        try {
            File inFile = new File("src\\main\\resources\\file.txt");
            br = new BufferedReader(new FileReader(inFile));
            sb = new StringBuilder();
            while (br.ready()) {
                sb.append(br.readLine()).append(" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb;
    }
}
