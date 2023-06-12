import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise42 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> morse = readMorse("morse.txt");    
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        while (!input.equals("#")) {
            String[] data = input.split(" "); 
            System.out.println(process(data, morse).trim());
            input = keyboard.nextLine();
        }
        keyboard.close();
    }

    public static String process(String [] line, HashMap<String, String> morse) {
        String output = "";
        for (int i = 0; i < line.length; i++) {
            String word = line[i];
            for (int j = 0; j < word.length(); j++) {
                String letter = word.substring(j, j+1);
                output += morse.get(letter.toUpperCase()) + " ";
            }
            output += " ";
        }
        return output;
    }

    public static HashMap<String,String> readMorse(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        HashMap<String,String> morse = new HashMap<String,String>();
        String line = in.readLine();
        while (line != null) {
            String[] parts = line.split(":");
            String name = parts[0];
            String code = parts[1];
            morse.put(name, code);
            line = in.readLine();
        }
        in.close();
        return morse;
    }
}