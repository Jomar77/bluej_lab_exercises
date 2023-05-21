/*
 * Write a program that reads in a series of lines from file raw.txt processes
them and writes them out to standard output
Each line contains a name and a series of scores for a game - all data on
the line is separated by spaces
Output the name and the top three scores in descending order
There will always be at least 3 scores for each name in the raw data file

Sample File raw.txt 
Mary 45 87 23 76 
Joe 34 76 12 78 34 87 
Anne 90 5 99 

Sample Output
Mary 87 76 45
Joe 87 78 76
Anne 99 90 5
 */
import java.util.*;
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