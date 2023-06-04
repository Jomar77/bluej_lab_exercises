import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise38 {
    public static void main(String[] args) throws IOException {
            HashMap<String, Integer> calories = writeHashMap("diet.txt");
            Scanner kb = new Scanner(System.in);
            String line = kb.nextLine();
            while (!line.equals("#")) {
                printOutput(calories, line);
                line = kb.nextLine();
            }
    }
    
    public static void printOutput(HashMap<String, Integer> map, String key) {  
        String[] data = key.split(",");
        String[] first = data[0].split(":");
        String[] second = data[1].split(":");
        int firstQuantity = Integer.parseInt(first[1]);
        int secondQuantity = Integer.parseInt(second[1]);
        int firstCalorie = map.get(first[0]);
        int secondCalorie = map.get(second[0]);
        if (firstCalorie * firstQuantity < secondCalorie * secondQuantity) {
            System.out.println(first[0] + "," + firstQuantity + "," + firstCalorie * firstQuantity);
        } else if (firstCalorie * firstQuantity > secondCalorie * secondQuantity) {
            System.out.println(second[0] + "," + secondQuantity + "," + secondCalorie * secondQuantity);
        } else {
            System.out.println("Same Value");
        }
    }
    public static HashMap<String, Integer> writeHashMap(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        HashMap<String, Integer> calories = new HashMap<String, Integer>();
        while (line != null) {
            String[] data = line.split("\t");
            String food = data[0];
            int calorie = Integer.parseInt(data[1]);
            calories.put(food, calorie);
            line = in.readLine();
        }
        return calories;
    }
}
