/*
The file pricelist.txt contains a list of goods in a diary and their prices.
Each line in the file contains a name (without spaces) and a price (a
double)
Read the list and create a HashMap using the item name as the key and
the price as the data

Sample file pricelist.txt
Bread 2.20
Lemonade 1.95
Butter 5.80
Mince_Pie 0.95
Chocolate 3.50

From standard input read a shopping list
Each line contains an item name and a quantity required (as an integer)
For each line output the name of the item, the quantity, and @ symbol, its
price (which is to be looked up in the map) to two decimal places and
preceded by a $ symbol and the total price to 2 decimal places and
preceded by a $ symbol.
The input data will end in a single line containing a #
Do not process the line with the # in it
If the shopping list item does not exist in the inventory then output
the item name with the text “Not available” beside it

Sample Input:
Butter 2
Mince_Pie 3
Chocolate 1
#

Sample Output:
Butter 2 @ $5.80 $11.60
Mince_Pie 3 @ $0.95 $2.85
Chocolate 1 @ $3.50 $3.50
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise34 {
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
            System.out.println("Put Name and quantity:");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String[] data = line.split(" ");
                String name = data[0];
                int quantity = Integer.parseInt(data[1]);
                if (prices.containsKey(name)) {
                    double price = prices.get(name);
                    System.out.printf("%s %d @ $%.2f $%.2f %n", name, quantity, price, price * quantity);
                } else {
                    System.out.printf("%s Not available", name);
                }
                System.out.println("Put Name and quantity:");
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}