import java.util.*;
import java.io.*;

/**
 * Write a description of class prac here.
 *
 * @Jomar
 * @version (a version number or a date)
 */
public class e34 {
    public static void main(String args[]) throws IOException {
        Scanner kb = new Scanner(System.in);
        HashMap<String, Double> prices = readPrice("pricelist.txt");
        String in = kb.next();
        int num = kb.nextInt();

        while (!in.equals("#")) {
            if (prices.containsKey(in)) {
                System.out.printf("%s %d@$%.2f $%.2f\n", in, num, prices.get(in), num * prices.get(in));
            } else {
                System.out.printf("%s Not available\n", in);
            }
            in = kb.next();
            num = kb.nextInt();
        }

    }

    public static HashMap<String,Double> readPrice (String filename) throws IOException{
        HashMap <String,Double> price = new HashMap<String,Double>();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextLine()){
            String name = sc.next();
            double number = sc.nextDouble(); 
            price.put(name, number);
            
        }
        return price;
    }
}