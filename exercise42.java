import java.io.*;
import java.util.*;

public class exercise42 {
    public static void main(String[] args) throws IOException {
        HashMap<String, String> morseCode = readMorse("morse.txt");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("#")) {
            Scanner in = new Scanner(input);
            while (in.hasNext()) {
                String word = in.next();
                for (int i = 0; i < word.length(); i++) {
                    System.out.print(morseCode.get(word.substring(i, i + 1).toUpperCase()));
                    System.out.print(" ");
                }
            }
            System.out.println();
            input = sc.nextLine();
        }
    }

    public static HashMap<String, String> readMorse(String filename) throws IOException {
        HashMap<String, String> morseCode = new HashMap<String, String>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            morseCode.put(parts[0], parts[1]);
        }
        return morseCode;
    }
}