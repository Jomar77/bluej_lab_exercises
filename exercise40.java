import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise40 {
    public static void main(String[] args) throws IOException{
            HashMap<String, Double> weapons = meleeReader("melee.txt");
            HashMap<String, Double> input = new HashMap<String, Double>();
            Scanner keyboard = new Scanner(System.in);
            String line = keyboard.nextLine();
            while (!line.equals("#")) {
                Double attack = attackCompare(line, input);
                input.put(line, attack);
                line = keyboard.nextLine();
            }
            for (String key : input.keySet()) {
                process(key, weapons);
            }
    }
    public static Double attackCompare(String line, HashMap<String, Double> weapons) {
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
        return ogre;
    }

    public static void process(Double totalHero, Double totalOgre) {
        if (totalHero > totalOgre) {
            System.out.println("Hero");
        } else if (totalHero < totalOgre) {
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
}
