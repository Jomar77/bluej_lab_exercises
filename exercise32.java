import java.util.Scanner;
import java.util.Arrays;
import java.io.File;

public class exercise32{
  public static void main(String[] args) throws Exception{
    Scanner scan = new Scanner(new File("raw.txt"));
    while(scan.hasNextLine()){
      String[] line = scan.nextLine().split(" ");
      String name = line[0];
      int[] scores = new int[line.length-1];  
      for(int i = 1; i < line.length; i++){
        scores[i-1] = Integer.parseInt(line[i]);
      }
      Arrays.sort(scores);
      System.out.println(name + " " + scores[scores.length-1] + " " + scores[scores.length-2] + " " + scores[scores.length-3]);
    }
  }
}