import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> gems = readGems("gems.txt");    
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        while (!input.equals("#")) {
            String[] data = input.split(" "); 
            System.out.println(process(data, gems) + " gp");
            input = keyboard.nextLine();
        }
        keyboard.close();
    }

    public static Integer process(String [] line, HashMap<String, Integer> gems) {
        int totalValue = 0;
        for (int i = 0; i < line.length; i+=2) {
            String name = line[i];
            int quantity = Integer.parseInt(line[i+1]);
            totalValue += gems.get(name) * quantity;
        }
        return totalValue;
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