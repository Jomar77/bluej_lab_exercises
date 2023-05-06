
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise36 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("pricelist.txt"));
            String line = in.readLine();
            HashMap<String, Double> prices = new HashMap<String, Double>();
            while (line != null) {
                String[] data = line.split(" ");
                String name = data[0];
                double price = Double.parseDouble(data[1]);
                prices.put(name, price);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String[] data = line.split(" ");
                double total = 0;
                for(int i = 0; i < data.length; i+=2){
                    String name = data[i];
                    double price = 0;
                    int quantity = Integer.parseInt(data[i+1]);
                    if (prices.containsKey(name)) {
                        price = prices.get(name);
                        total += price * quantity;
                    } else {
                        System.out.printf("%s Not available%n", name);
                    }
                }
                System.out.printf("%s", total);
                System.out.printf("%nPut Name and quantity:");
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}