import java.util.Scanner;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exercise35 {
    public static void main(String[] args) throws IOException {
            HashMap<String, String> phone = readPhone("phone.txt");
            String line;
            Scanner keyboard = new Scanner(System.in);
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                System.out.println(!phone.containsKey(line) ? line + " unknown" : line + " "+  phone.get(line));
                line = keyboard.nextLine();
            }
            keyboard.close();
    }

    public static HashMap<String,String> readPhone(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String line = in.readLine();
        HashMap<String, String> phone = new HashMap<String, String>();
        while (line != null) {
            String[] data = line.split(" ");
            String name = data[0];
            String number = data[1];
            phone.put(name, number);
            line = in.readLine();
        }
        return phone;
    }
}