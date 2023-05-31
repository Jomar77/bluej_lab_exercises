import java.util.*;
import java.io.*;

public class exercise35 {
    public static void main(String[] args) throws IOException {
            BufferedReader in = new BufferedReader(new FileReader("phonelist.txt"));
            HashMap<String, String> phone = new HashMap<String, String>();
            String line = in.readLine();
            while (line != null) {
                String[] data = line.split(" ");
                phone.put(data[0],data[1] + " " + data[2]);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                System.out.println(!phone.containsKey(line) ? line + " unknown" : line + " "+  phone.get(line));
                line = keyboard.nextLine();
            }
    }
}