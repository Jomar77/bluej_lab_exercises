import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise41 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("travel.txt"));
            String line = in.readLine();
            HashMap<String, Integer> distances = new HashMap<String, Integer>();
            while (line != null) {
                String[] data = line.split(":");
                String from = data[0];
                String[] to = data[1].split(",");
                String toLocation = to[0];
                int distance = Integer.parseInt(to[1]);
                distances.put(from + ":" + toLocation, distance);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put ");
            line = keyboard.nextLine();
            int maxDistance = Integer.parseInt(line);
            line = keyboard.next();
            while (!line.equals("#")) {
                String[] data = line.split(",");
                int totalDistance = 0;
                int i = 0;
                while (i < data.length) {
                    String from = data[i].split(":")[0];
                    String to = data[i].split(":")[1];
                    totalDistance += distances.get(from + ":" + to);
                    i++;
                }
                if (totalDistance <= maxDistance) {
                    System.out.println(line + " " + totalDistance + "km");
                }
                else {
                    System.out.println("Too far, try another route");
                }
                line = keyboard.next();
            }
        } catch (IOException e) {
            System.out.println("Problem reading file");
        }
    }
}
