import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> gems = readGems("gems.txt");    
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();
        while (!input.equals("#")) {
            process(input, gems);
            input = keyboard.nextLine();
        }
        keyboard.close();
    }

    public static void process(String line, HashMap<String, Integer> gems) {
        String[] data = line.split(",");
        int totalValue = 0;
        for (int i = 0; i < data.length -1; i++) {
            String name = data[i].split(":")[0];
            int quantity = Integer.parseInt(data[i].split(":")[1]);
            totalValue += gems.get(name) * quantity;
        }
        System.out.println(totalValue + " gp");
    }

    public static HashMap<String,Integer> readGems(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        HashMap<String,Integer> gems = new HashMap<String,Integer>();
        String line = in.readLine();
        while (line != null) {
            String[] parts = line.split(":");
            String name = parts[0];
            int value = Integer.parseInt(parts[1]);
            gems.put(name, value);
            line = in.readLine();
        }
        in.close();
        return gems;
    }
}