import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> gems = new HashMap<>();
        File file = new File("gems.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] parts = line.split(":");
            String name = parts[0];
            int value = Integer.parseInt(parts[1]);
            gems.put(name, value);
        }
        input.close();
        input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("#")) {
                break;
            }
            String[] parts = line.split(" ");
            String name1 = parts[0];
            int quantity1 = Integer.parseInt(parts[1]);
            String name2 = parts[2];
            int quantity2 = Integer.parseInt(parts[3]);
            int value1 = gems.get(name1);
            int value2 = gems.get(name2);
            int total = value1 * quantity1 + value2 * quantity2;
            System.out.printf("%d gp", total);
        }
        input.close();
    }
}