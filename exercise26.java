/*
 * 
 * In order to make the internet more user-friendly we can filter out
unpleasant words and replace them with more pleasant ones
Write a program that is supplied a series of comma delimited pairs of
words as command line parameters and then proceeds to read in lines
from standard input until a line is entered containing a single '#'.
For each line except for the terminating line output the same line with the
unpleasant words replaced by the pleasant words
For this prototype you can assume the input will
all be lower case and have no punctuation marks.
The sample input should produce the given output
when executing Lab26 as shown to the right

Sample Input 
todays exam will be difficult 
you need to work harder 
the assessment is due now 
#


Sample Output
todays quiz will be easy
you need to play harder
the assessment is due later


(Hint Use the args array and the String replace method)
 */

import java.util.Scanner;

public class exercise26{
  public static void main(String[] args){
    args = new String[]{"difficult,easy", "work,play", "now,later"};
    String[] words = new String[args.length*2];
    Scanner scan = new Scanner(System.in);
    for(int i = 0; i < args.length; i++){
        words[i] = args[i].split(",")[0];
        words[i+1] = args[i].split(",")[1];
        System.out.print(words[i] + " " + words[i+1] + " ");
    }
    String line = scan.nextLine();
    while(!line.equals("#")){
      for(int i = 0; i < args.length; i ++){
        line = line.replace(words[i], words[i+1]);
      }
      System.out.println(line);
      line = scan.nextLine();
    }
  }
}