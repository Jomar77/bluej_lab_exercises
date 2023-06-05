import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise40 {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> weapons = meleeReader("melee.txt");
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        while (!line.equals("#")) {
            System.out.println(attackString(line, weapons));
            line = keyboard.nextLine();
        }
        keyboard.close();
    }


    public static String attackString(String line, HashMap<String, Double> weapons) {
        String[] data = line.split(" ");
        double totalHero = 0;
        double totalOgre = 0;
        String weaponHero = data[0];
        double effectivenessHero = Double.parseDouble(data[1]);
        String weaponOgre = data[2];
        double effectivenessOgre = Double.parseDouble(data[3]);
        totalHero += weapons.get(weaponHero) * effectivenessHero;
        totalOgre += weapons.get(weaponOgre) * effectivenessOgre;
        // create a ternary that returns hero or ogre or neither
        return totalHero > totalOgre ? "Hero" : totalOgre > totalHero ? "Ogre" : "Neither";
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
}