
import java.util.Scanner;

public class exercise43 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        while (!line.equals("#")) {
            String result = "";
            boolean inQuotes = false;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '"') {
                    inQuotes = !inQuotes;
                }
                if (c == ',' && !inQuotes) {
                    result += ";";
                } else {
                    result += c;
                }
            }
            System.out.println(result);
            line = keyboard.nextLine();
        }
    }
}