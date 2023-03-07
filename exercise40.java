/*
 * The scene is a dark cave – the hero slowly approaches the end the cave
and sees a large angry Ogre! The battle commences as they charge
each other!
The battle progresses until one drops.
The file melee.txt contains a list of weapons used by the two combatants
and their raw (potential) damage.
Follow the combat and find the winner of each melee round!
Each line in the file contains a weapon name (all lowercase and no
spaces) and its raw damage (a double value).
The weapon name and the raw damage are separated by a colon :
Read the list and create a HashMap using the weapon name as the key
and the raw damage as the value
Sample file melee.txt
sword:12.0
mace:6.0
dagger:4.0
claw:6.0
bite:4.0
club:8.0
punch:2.0
From standard input read a list of melee rounds
Each line contains a series of lines containing the blows landed by the
hero then those landed by the ogre for that melee round.
Each blow description is composed of the name of the weapon used
followed by an effectiveness rating ranging from 0.0 to 1.0
The effectiveness determines how effective the blow was – for example:
a 0.0 means a total miss, 1.0 means a solid hit. A value of 0.2 might be a
glancing blow, and a mid range of about 0.5 could be a blow partially
parried etc.
25 | P a g e
For each line calculate the total value of the damage done by each
combatant by multiplying their weapon's raw damage by the effectiveness
of the strike.
At the end of each melee output the combatant who did the most damage
– Hero or Ogre or both did the same damage output Neither
The input data will end with a line containing only a single #
Do not process the line with the # in it
Assume all weapons exist in the file.
Sample Input Sample Output
sword 0.5 claw 0.8
sword 0.9 club 0.6
dagger 0.9 bite 1.0
dagger 0.8 club 0.4
sword 0.7 claw 0.8
punch 1.0 bite 0.8
#
Hero
Hero
Ogre
Neither
Hero
Ogre
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class exercise40 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("melee.txt"));
            String line = in.readLine();
            HashMap<String, Double> weapons = new HashMap<String, Double>();
            while (line != null) {
                String[] data = line.split(":");
                String weapon = data[0];
                double value = Double.parseDouble(data[1]);
                weapons.put(weapon, value);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put in the weapons and effectiveness");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String[] data = line.split(" ");
                double totalHero = 0;
                double totalOgre = 0;
                for (int i = 0; i < data.length; i += 2) {
                    String weapon = data[i];
                    double effectiveness = Double.parseDouble(data[i + 1]);
                    if (i < data.length / 2) {
                        totalHero += weapons.get(weapon) * effectiveness;
                    } else {
                        totalOgre += weapons.get(weapon) * effectiveness;
                    }
                }
                if (totalHero > totalOgre) {
                    System.out.println("Hero");
                } else if (totalHero < totalOgre) {
                    System.out.println("Ogre");
                } else {
                    System.out.println("Neither");
                }
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
