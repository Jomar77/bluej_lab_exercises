import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise41 {
    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> distances = readDistances("travel.txt");
        Scanner keyboard = new Scanner(System.in);

        String line = keyboard.nextLine();
        int maxDistance = Integer.parseInt(line);
        line = keyboard.next();
        while (!line.equals("#")) {
            process(line, distances, maxDistance);
            distances.clear();
            line = keyboard.nextLine();
        }
        keyboard.close();
    }

    public static void process(String line, HashMap<String, Integer> distances, int maxDistance) {
            String[] data = line.split(",");
            int totalDistance = 0;
            for (int i = 0; i < data.length; i++) {
                String from = data[i].split(":")[0];
                String to = data[i].split(":")[1];
                totalDistance += distances.get(from + ":" + to);
            }
            if (totalDistance <= maxDistance) {
                System.out.println(line + " " + totalDistance + "km");
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