/*
 * The file travel.txt contains a list of travel distances between holiday
locations.
Each line is in the form From:To,Distance
Where From and To are South Island locations, and Distance is an
integer measured in km.
Sample file travel.txt
Gore:Winton,65
Invercargill:Gore,65
Invercargill:Wanaka,246
Winton:Invercargill,31
Wanaka:Queenstown,70
Queenstown:Invercargill,190
• You are to read a series of planned holidays from standard input
• The first line is the maximum distance you want to travel (because
your time and finance is limited for the holiday)
• Following that are a series of lines each representing the travelling
done in a holiday journey.
• Each holiday journey is in the form
From:To,From:To,From:To,From:To
• There may be up to 50 From:To journey pairs per line.
The input data will end in a single line containing a #
Do not process the line with the # in it
As you have limited time for your holiday your task is to only output
journeys which total the specified distance or less and their total distance.
(Hint Use a HashMap)
Sample Input
200
Invercargill:Gore,Gore:Winton,Winton:Invercargill
Invercargill:Wanaka,Wanaka:Queenstown, Queenstown:Invercargill
#
Sample Output
Invercargill:Gore,Gore:Winton,Winton:Invercargill 161km
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class e41 {
    public static void main(String[] args) {
        // Read the maximum distance from standard input
        Scanner scanner = new Scanner(System.in);
        int maxDistance = Integer.parseInt(scanner.nextLine());

        // Read the travel distances from the file and store them in a HashMap
        Map<String, Integer> travelDistances = readTravelDistancesFromFile("travel.txt");

        // Read the planned holidays from standard input
        scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.equals("#")) {
                break; // Stop reading when '#' is encountered
            }

            String[] journeys = line.split(",");
            int totalDistance = 0;
            StringBuilder result = new StringBuilder();
            boolean validHoliday = true;

            for (String journey : journeys) {
                int distance = travelDistances.getOrDefault(journey, -1);
                if (distance == -1) {
                    validHoliday = false; // Invalid journey
                    break;
                }
                totalDistance += distance;
                result.append(journey).append(",");
            }

            if (validHoliday && totalDistance <= maxDistance) {
                result.deleteCharAt(result.length() - 1); // Remove trailing comma
                System.out.println(result + " " + totalDistance + "km");
            }
        }
        scanner.close();
    }

    private static Map<String, Integer> readTravelDistancesFromFile(String filename) {
        Map<String, Integer> travelDistances = new HashMap<>();
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String[] locations = parts[0].split(":");
                String from = locations[0];
                String to = locations[1];
                int distance = Integer.parseInt(parts[1]);

                travelDistances.put(from + ":" + to, distance);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return travelDistances;
    }
}
