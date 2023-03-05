/*  
 Write a program that reads in a series of lines from file names.txt and
stores them in an ArrayList of Strings.
The program should then continue to read a series of names from
standard input until a line with only a # is reached
For each name it should output the name, a colon then the number of
times that name is located within the ArrayList (as shown below).
Do not process the line with the #

Sample names in file names.txt:
Harry
Sue
John
Mary
James
Mary
Mary
Anne

Sample output:

Mary Mary: 3
Joe Joe: 
Anne 

 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class exercise32 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("raw.txt"));
            String line = in.readLine();
            while (line != null) {
                ArrayList<String> names = new ArrayList<String>();
                String[] data = names.toArray(new String[0]);
                String name = data[0];
                int[] scores = new int[data.length - 1];
                for (int i = 1; i < data.length; i++) {
                    scores[i - 1] = Integer.parseInt(data[i]);
                }
                for (int i = 0; i < scores.length; i++) {
                    for (int j = 0; j < scores.length - 1; j++) {
                        if (scores[j] < scores[j + 1]) {
                            int temp = scores[j];
                            scores[j] = scores[j + 1];
                            scores[j + 1] = temp;
                        }
                    }
                }
                System.out.print(name + " ");
                for (int i = 0; i < 3; i++) {
                    System.out.print(scores[i] + " ");
                }
                System.out.println();
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}
