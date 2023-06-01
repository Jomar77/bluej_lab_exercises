import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args)  throws IOException{
            HashMap<String, String> numberplates = readHashMap("numberplates.txt");
            Scanner keyboard = new Scanner(System.in);
            String line = keyboard.nextLine();
            while(!line.equals("#")){
                printHashMap(numberplates);
            }
    }

    public static void printHashMap(HashMap<String, String> map) {
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }

    public static HashMap<String, String> readHashMap(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        HashMap<String, String> map = new HashMap<String, String>();
        while (line != null) {
            String[] data = line.split(":");
            String key = data[0];
            String value = data[1];
            map.put(key, value);
            line = in.readLine();
        }
        return map;
    }
}
