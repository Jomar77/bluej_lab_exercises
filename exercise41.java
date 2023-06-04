import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise41 {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> distances = readDistances("distances.txt");
        String line;
        Scanner keyboard = new Scanner(System.in);
        
        line = keyboard.nextLine();
        int maxDistance = Integer.parseInt(line);
        line = keyboard.next();
        while (!line.equals("#")) {
            process(line, distances, maxDistance);
            line = keyboard.next();
        }
        keyboard.close();
    }

    public static void process (String line, HashMap<String, Integer> distances, int maxDistance){
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
            } else {
                System.out.println("Too far, try another route");
            }
        }
    }
    public static HashMap<String, Integer> readDistances(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        HashMap<String, Integer> distances = new HashMap<String, Integer>();
        String line = in.readLine();
        while (line != null) {
            String[] data = line.split(":");
            String from = data[0];
            String[] to = data[1].split(",");
            String toLocation = to[0];
            int distance = Integer.parseInt(to[1]);
            distances.put(from + ":" + toLocation, distance);
            line = in.readLine();
        }
        return distances;
    }
}