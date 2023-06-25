import java.util.Scanner;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class exercise35 {
    public static void main(String[] args) throws IOException {
            HashMap<String, String> phone = readPhone("phonelist.txt");
            String line;
            Scanner keyboard = new Scanner(System.in);
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                System.out.println(!phone.containsKey(line) ? line + " unknown" : line + " "+  phone.get(line));
                line = keyboard.nextLine();
            }
            keyboard.close();
    }

    HashMap <String,Double> price = new HashMap<String,Double>();
        Scanner sc = new Scanner(new File(filename));
        while(sc.hasNextLine()){
            String name = sc.next();
            double number = sc.nextDouble(); 
            price.put(name, number);
            
            return price;
        }
    }
}