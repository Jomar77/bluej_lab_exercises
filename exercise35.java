import java.util.Scanner;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class exercise35 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("phonelist.txt"));
            String line = in.readLine();
            HashMap<String, String> phone = new HashMap<String, String>();
            while (line != null) {
                String[] data = line.split(" ");
                String number = data[0];
                String name = data[1];
                for (int i = 2; i < data.length; i++) {
                    name = name + " " + data[i];
                }
                phone.put(number, name);
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
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}