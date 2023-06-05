import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise34 {
    public static void main(String[] args) throws IOException {

        HashMap<String, Double> prices = readPrice("prices.txt");
        String line;y
        Scanner keyboard = new Scanner(System.in);
        line = keyboard.nextLine();
        while (!line.equals("#")) {
            String[] data = line.split(" ");
            String name = data[0];
            int quantity = Integer.parseInt(data[1]);
            if (prices.containsKey(name)) {
                double price = prices.get(name);
                System.out.printf("%s %d@$%.2f $%.2f%n", name, quantity, price, price * quantity);
            } else {
                System.out.printf("%s Not available%n", name);
            }
            line = keyboard.nextLine();
        }
    }

    public static HashMap readPrice(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        HashMap<String, Double> prices = new HashMap<String, Double>();
        while (line != null) {
            String[] data = line.split(" ");
            String name = data[0];
            double price = Double.parseDouble(data[1]);
            prices.put(name, price);
            line = in.readLine();
        }
        return prices;
    }
}