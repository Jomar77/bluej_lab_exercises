import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * This class reads a series of lines from file raw.txt, processes it and writes
 * it out to
 * standard output. Each line contains a name and a series of scores for a game.
 * It prints
 * out the name and the top three scores in descending order. There should be at
 * least 3
 * scores for each name in the raw data file.
 *
 * @author Gabryel Cruz
 * @version 1.0 19/10/2023
 */
public class lab33 {
    /**
     * This is the entry point of the program.
     */
    public static void main(String[] args) throws IOException {
        Scanner table = new Scanner(System.in);
        String rawfile = table.nextLine();
        Scanner list = new Scanner(new File(rawfile));

        while (list.hasNextLine()) {
            String rec = list.nextLine();
            String[] recs = rec.split(" ");
            String name = recs[0];
            int[] scores = new int[recs.length - 1];
            for (int i = 1; i < recs.length; i++) {
                scores[i - 1] = Integer.parseInt(recs[i]);
            }

            Arrays.sort(scores);
            System.out.print(name + " ");
            for (int i = 1; i < 4; i++) {
                System.out.print(scores[scores.length - i] + " ");
            }
            System.out.println();
        }

        list.close();
    }
}
