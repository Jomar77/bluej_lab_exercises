import java.util.*;
import java.io.*;

public class exercise35 {
    public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new FileReader("phonelist.txt"));
            HashMap<String, String> phone = new HashMap<String, String>();
            String line = in.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                phone.put(data[0], data[1] + " " + data[2]);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String name = phone.get(line);
                if (name == null) {
                    System.out.println(line + " unknown");
                } else {
                    System.out.println(line + " " + name);
                }
                line = keyboard.nextLine();
            }
    }
}