import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise41 {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> distances = readDistances("travel.txt");
        Scanner keyboard = new Scanner(System.in);
        HashMap<String, Integer> data = new HashMap<String, Integer>();
        String line = keyboard.nextLine();
        int maxDistance = Integer.parseInt(line);
        line = keyboard.nextLine();
        while (!line.equals("#")) {
            int distance = process(line, distances);
            data.put(line, distance);
            line = keyboard.nextLine();
        }
        for (String key : data.keySet()) {
            if (data.get(key) <= maxDistance) {
                System.out.println(key + " " + data.get(key) + "km");
            }
        }
        
        keyboard.close();
    }

    public static Integer process(String line, HashMap<String, Integer> distances) {
        String[] data = line.split(",");
        int totalDistance = 0;
        for (int i = 0; i < data.length; i++) {
            String from = data[i].split(":")[0];
            String to = data[i].split(":")[1];
            totalDistance += distances.get(from + ":" + to);
        }
        return totalDistance;
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