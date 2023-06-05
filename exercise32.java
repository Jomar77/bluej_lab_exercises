import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

public class exercise32 {
  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(new File("raw.txt"));
    while (scan.hasNextLine()) {
      String[] line = scan.nextLine().split(" ");
      String name = line[0];
      int[] scores = new int[line.length - 1];
      for (int i = 1; i < line.length; i++) {
        scores[i - 1] = Integer.parseInt(line[i]);
      }
      Arrays.sort(scores);
      System.out.print(name + " " ); 
      for (int i = 1; i < 4; i++) {
        System.out.print(scores[scores.length - i ] + " ");
      }
      System.out.println();
    }
  }
}