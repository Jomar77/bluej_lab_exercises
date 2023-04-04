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
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise39 {
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, Integer> gems = new HashMap<>();
        File file = new File("gems.txt");
        Scanner input = new Scanner(file);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String[] parts = line.split(":");
            String name = parts[0];
            int value = Integer.parseInt(parts[1]);
            gems.put(name, value);
        }
        input.close();
        input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String line = input.nextLine();
            if (line.equals("#")) {
                break;
            }
            String[] parts = line.split(" ");
            String name1 = parts[0];
            int quantity1 = Integer.parseInt(parts[1]);
            String name2 = parts[2];
            int quantity2 = Integer.parseInt(parts[3]);
            int value1 = gems.get(name1);
            int value2 = gems.get(name2);
            int total = value1 * quantity1 + value2 * quantity2;
            System.out.printf("%d gp", total);
        }
        input.close();
    }

    String name = "John";
    String surname = "Doe";

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}