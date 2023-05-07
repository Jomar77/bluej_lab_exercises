import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("numberplates.txt"));
            String line = in.readLine();
            HashMap<String, String> numberplates = new HashMap<String, String>();
            while (line != null) {
                String[] data = line.split(":");
                String numberplate = data[0];
                String name = data[1];
                numberplates.put(numberplate, name);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                if (numberplates.containsKey(line)) {
                    System.out.println(numberplates.get(line));
                } else {
                    System.out.println("Unregistered Car");
                }
                System.out.println("Put numberplate:");
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}
