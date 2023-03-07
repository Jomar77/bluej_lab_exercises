/*
The file gems.txt contains a list of gems in a fantasy game and their game
value in gold pieces.
Each line in the file contains a gem name (without spaces) and an integer
value in gold pieces – the name and the value are separated by a colon:
Read the list and create a HashMap using the gem name as the key and
the value as the data
Sample file gems.txt
quartz:4
pearl:6
onyx:1
ruby:40
calcite:1
From standard input read a list of adventurer's loot.
Each line contains a series of lines containing two gem names and how
many of each the adventurer has acquired (as an integer)
For each line output the total value of the gems followed by gp (gold
pieces) as in the sample output.
The input data will end in a single line containing a #
Do not process the line with the # in it
Assume all gems exist in the file.
Sample Input Sample Output
pearl 2 ruby 1 52 gp
onyx 5 quartz 3 17 gp
#
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("gems.txt"));
            String line = in.readLine();
            HashMap<String, Integer> gems = new HashMap<String, Integer>();
            while (line != null) {
                String[] data = line.split(":");
                String gem = data[0];
                int value = Integer.parseInt(data[1]);
                gems.put(gem, value);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put Name and quantity:");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String[] data = line.split(" ");
                int total = 0;
                for (int i = 0; i < data.length; i += 2) {
                    String gem = data[i];
                    int quantity = Integer.parseInt(data[i + 1]);
                    total += gems.get(gem) * quantity;
                }
                System.out.println(total + " gp");
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}