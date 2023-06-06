import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise42 {

    public static void main(String[] args) throws IOException {
        HashMap <String,String> morseCode = readMorse("morse.txt");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("#")) {
            String[] words = input.split(" ");
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    System.out.print(morseCode.get(word.substring(i, i + 1).toUpperCase()) + " ");
                }
            }
            System.out.println();
            input = sc.nextLine();
        }
        sc.close();
    }
    public static HashMap <String,String> readMorse(String filename)  throws IOException{
        HashMap<String, String> morseCode = new HashMap<String, String>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(":");
            morseCode.put(parts[0], parts[1]);
        }
        br.close();
        return morseCode;
    }
}