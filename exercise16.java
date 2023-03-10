/* Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Output the number of times an asterix occurs on each line of input
If an ! appears on the line do not count asterixes beyond the !
Do not output a result for the line containing the #
(Hint Use break) */

import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int j = 0;
        int a = 0;
        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();
        while (!line.equals("#")) {
            for (j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '*') {
                    a++;
                }else if (line.charAt(j) == '!') {
                    break;
                }
            }
            System.out.println("*:" + a);
            a = 0;
            line = input.nextLine();
        }
    }
}