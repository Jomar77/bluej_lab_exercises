import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise40 {
    public static void main(String[] args) throws IOException{
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
    }
}
