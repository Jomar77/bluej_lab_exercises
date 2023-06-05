 import java.util.HashMap;
 import java.util.Scanner;
 import java.io.File;
 import java.io.FileNotFoundException;
 
 public class e40 {
     public static void main(String[] args) {
         // Read the weapons and their raw damage from the file
         HashMap<String, Double> weapons = readWeaponsFromFile("melee.txt");
         
         
         // Read the melee rounds from standard input
         Scanner scanner = new Scanner(System.in);
         String line;
         while (scanner.hasNextLine()) {
             line = scanner.nextLine().trim();
             if (line.equals("#")) {
                 break;
             }
             
             // Split the line into hero's blows and ogre's blows
             String[] blows = line.split(" ");
             if (blows.length % 2 != 0) {
                 System.out.println("Invalid input format for melee round.");
                 return;
             }
             
             // Calculate the total damage for each combatant
             double heroDamage = 0.0;
             double ogreDamage = 0.0;
             for (int i = 0; i < blows.length; i += 2) {
                 String weapon = blows[i];
                 double effectiveness = Double.parseDouble(blows[i + 1]);
                 
                 // Lookup the raw damage for the weapon
                 if (weapons.containsKey(weapon)) {
                     double rawDamage = weapons.get(weapon);
                     
                     // Calculate the damage inflicted by the blow
                     double damage = rawDamage * effectiveness;
                     
                     // Assign the damage to the corresponding combatant
                     if (i % 4 == 0) {
                         heroDamage += damage;
                     } else {
                         ogreDamage += damage;
                     }
                 }
             }
             
             // Determine the winner or if it's a tie
             if (heroDamage > ogreDamage) {
                 System.out.println("Hero");
             } else if (ogreDamage > heroDamage) {
                 System.out.println("Ogre");
             } else {
                 System.out.println("Neither");
             }
         }
         
         scanner.close();
     }
     
     private static HashMap<String, Double> readWeaponsFromFile(String filename) {
         HashMap<String, Double> weapons = new HashMap<>();
         try {
             Scanner fileScanner = new Scanner(new File(filename));
             while (fileScanner.hasNextLine()) {
                 String line = fileScanner.nextLine().trim();
                 if (!line.isEmpty()) {
                     String[] parts = line.split(":");
                     String weapon = parts[0];
                     double damage = Double.parseDouble(parts[1]);
                     weapons.put(weapon, damage);
                 }
             }
             fileScanner.close();
         } catch (FileNotFoundException e) {
             return null;
         }
         return weapons;
     }
 }
 
 /*
  * import java.io.*;
import java.util.*;

public class exercise40 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> weapons = meleeReader("melee.txt");
        HashMap<String, Double> ogreInput = new HashMap<String, Double>();
        HashMap<String, Double> heroInput = new HashMap<String, Double>();

        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int count = 0;
        while (!line.equals("#")) {
            count++;
            String[] fight = line.split(" ");
            for (int i = 0; i < fight.length; i += 2) {
                System.out.println(fight.length);
                String weapon = fight[i];
                double effectiveness = Double.parseDouble(fight[i + 1]);
                if (i % 4 == 0) {
                    heroInput.put(weapon, effectiveness);
                } else {
                    ogreInput.put(weapon, effectiveness);
                }
            }
            line = input.nextLine();
        }
        double [] heroDamage = new double[count];
        double [] ogreDamage = new double[count];

        for (int i = 0; i < count; i++) {
            for (String key : heroInput.keySet()) {
                double rawDamage = weapons.get(key);
                heroDamage [i] =  rawDamage * heroInput.get(key);
                System.out.println( key + " " +heroDamage[i]+ " " + heroInput.get(key) + " " + rawDamage + " " + heroInput.size());                
            }
            
            for (String key : ogreInput.keySet()) {
                double rawDamage = weapons.get(key);
                ogreDamage [i] = rawDamage * ogreInput.get(key);
            }

            System.out.println(heroDamage[i]+ " " + ogreDamage[i]);
            winDecision(heroDamage [i], ogreDamage[i]);
        }
    }

    public static void winDecision(double heroDamage, double ogreDamage) {
        if (heroDamage > ogreDamage) {
            System.out.println("Hero");
        } else if (ogreDamage > heroDamage) {
            System.out.println("Ogre");
        } else {
            System.out.println("Neither");
        }
    }

    public static HashMap<String, Double> meleeReader(String filename) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(filename));
        HashMap<String, Double> weapons = new HashMap<String, Double>();
        String line = in.readLine();
        while (line != null) {
            String[] data = line.split(":");
            String weapon = data[0];
            double value = Double.parseDouble(data[1]);
            weapons.put(weapon, value);
            line = in.readLine();
        }
        return weapons;

    }

    /*
     * public static void main(String[] args) throws IOException {
     * HashMap<String, Double> weapons = meleeReader("melee.txt");
     * HashMap<String, Double> input = new HashMap<String, Double>();
     * Scanner keyboard = new Scanner(System.in);
     * String line = keyboard.nextLine();
     * while (!line.equals("#")) {
     * Double attack = attackCompare(line, weapons);
     * input.put(line, attack);
     * line = keyboard.nextLine();
     * }
     * 
     * for (String key : input.keySet()) {
     * System.out.println(key + " " + input.get(key));
     * }
     * //print if the hero or ogre wins else neither
     * 
     * for (String key : input.keySet()) {
     * System.out.println(attackString(key, weapons));
     * }
     * keyboard.close();
     * }
     * 
     * 
     * 
     * public static String attackString(String line, HashMap<String, Double>
     * weapons) {
     * String[] data = line.split(" ");
     * double totalHero = 0;
     * double totalOgre = 0;
     * String weaponHero = data[0];
     * double effectivenessHero = Double.parseDouble(data[1]);
     * String weaponOgre = data[2];
     * double effectivenessOgre = Double.parseDouble(data[3]);
     * totalHero += weapons.get(weaponHero) * effectivenessHero;
     * totalOgre += weapons.get(weaponOgre) * effectivenessOgre;
     * // create a ternary that returns hero or ogre or neither
     * return totalHero > totalOgre ? "Hero" : totalOgre > totalHero ? "Ogre" :
     * "Neither";
     * }
     * 
     * 
     * }
     */
}

  */

