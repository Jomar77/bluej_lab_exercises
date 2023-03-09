/*
Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Output the number of vowels in each line of input
Do not output a result for the line containing the #
(Hint Use for – counter controlled loop)
*/

import java.util.Scanner;


public class exercise14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int i = 0;
        int vowels = 0;
        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();
        while (!line.equals("#")) {
            for (i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'a' || line.charAt(i) == 'e' || line.charAt(i) == 'i' || line.charAt(i) == 'o' || line.charAt(i) == 'u'|| 
                line.charAt(i) == A' || line.charAt(i) == E' || line.charAt(i) == 'I' || line.charAt(i) == 'O' || line.charAt(i) == 'U') {
                vowels++;
                }
            }
            System.out.println("There are " + vowels + " vowels in the line");
            vowels = 0;
            line = input.nextLine();
        }
    }
}