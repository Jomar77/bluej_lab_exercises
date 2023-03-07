/*The file travel.txt contains a list of travel distances between holiday
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
Invercargill:Gore,Gore:Winton,Winton:Invercargill 161km */

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
