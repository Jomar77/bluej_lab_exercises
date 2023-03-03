
/*In order to make the internet more user-friendly we can filter out
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
(Hint Use the args array and the String replace method) */

import java.util.Scanner;
public class exercise26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = new String[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = args[i];
        }
        System.out.println("Enter your text:");
        String text = input.nextLine();
        while (!text.equals("#")) {
            for (int i = 0; i < array.length; i++) {
                if (text.contains(array[i])) {
                    text = text.replace(array[i], array[i + 1]);
                }
            }
            System.out.println(text);
            text = input.nextLine();
        }
    }
}
