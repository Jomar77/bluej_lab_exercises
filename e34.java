import java.util.*;
import java.io.*;
/**
 * Write a description of class prac here.
 *
 * @Jomar
 * @version (a version number or a date)
 */
public class e34
{
    public static void main (String args[]) throws IOException{
        Scanner kb = new Scanner(System.in);
        HashMap<String, Double> prices = readPrice("pricelist.txt");
        String in = kb.next();
        double num = kb.nextDouble();
        while(!in.equals("#")){
            if(prices.containsKey(in)){
                System.out.printf("%s %d@$@%.2f $%.2f/n",in,num,prices.get(in), num*prices.get(in));
            }else{
                System.out.printf("%s Not available/n",in);
            }
            in = kb.next();
            num = kb.nextDouble();        
        }

    }

    public static HashMap<String,Double> readPrice(String filename) throws IOException{

        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line = br.readLine();
        HashMap<String,Double> pricelist = new HashMap<String,Double>();
        while(line != null){
            String [] data = line.split(" ");
            String name = data[0];
            Double price = Double.parseDouble(data[1]);
            pricelist.put(name,price);            
        }

        return pricelist;
    }
}
