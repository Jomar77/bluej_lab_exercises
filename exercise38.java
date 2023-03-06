/*
 * Laboratory Exercise 38 – Best Diet
The file diet.txt contains a list of foods and their calorie value for a
standard unit of that food.
Each line in the file contains a food type, a tab (\t) and a calorie value
Read the list and create a HashMap using the food type as the key and the
calorie value as the data

Sample file diet.txt
Salmon 52
Sardines (in brine) 48
Oysters 7
Noodles 27
Cheddar 9

From standard input read a list of food types and their quantity.
Each line contains two food types, a colon and the number of units of
each (as an integer), then a comma and the second food type and units.
For each line look up the calorie value of the first food type and multiply
it by the given number of units to give the total number of calories.
Compare this to the total calories of the second food type and output the
lesser of the two food types with the quantity and the total calorie value
all separated by commas as shown. If the same output Same Value
The input data will end in a single line containing a #
Do not process the line with the # in it
Assume all given food types exist in the data list (so no there is no need
to check for food types that do not exist.

Sample Input
Salmon:3,Oysters:2
Noodles:1,Cheddar:3
#

Sample Output
Oysters,2,14
Same Value
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise38 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("diet.txt"));
            String line = in.readLine();
            HashMap<String, Integer> calories = new HashMap<String, Integer>();
            while (line != null) {
                String[] data = line.split("\t");
                String food = data[0];
                int calorie = Integer.parseInt(data[1]);
                calories.put(food, calorie);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put Name and quantity:");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String[] data = line.split(",");
                String[] first = data[0].split(":");
                String[] second = data[1].split(":");
                int firstQuantity = Integer.parseInt(first[1]);
                int secondQuantity = Integer.parseInt(second[1]);
                int firstCalorie = calories.get(first[0]);
                int secondCalorie = calories.get(second[0]);
                if (firstCalorie * firstQuantity < secondCalorie * secondQuantity) {
                    System.out.println(first[0] + "," + firstQuantity + "," + firstCalorie * firstQuantity);
                } else if (firstCalorie * firstQuantity > secondCalorie * secondQuantity) {
                    System.out.println(second[0] + "," + secondQuantity + "," + secondCalorie * secondQuantity);
                } else {
                    System.out.println("Same Value");
                }
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
    }
}
