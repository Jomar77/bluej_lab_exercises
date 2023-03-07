/*
 * Write a program that reads in a series of lines from standard input
terminated by a line containing only a single '#'
Each line contains fields separated by commas and string fields
surrounded by double quotes.
You output a line to standard output where all commas in each line are
replaced with a semicolon ';' character except those commas which are
inside a quoted string
Do not output a result for the line containing the #
Sample Input 
"Sam",10,20,","
"Smith, Anne",20,"Gore"
Sample Output
 "Sam";10;20;","
 "Smith, Anne";20;"Gore"
 */

import java.util.Scanner;

public class exercise43 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String line = keyboard.nextLine();
        while (!line.equals("#")) {
            String result = "";
            boolean inQuotes = false;
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (c == '"') {
                    inQuotes = !inQuotes;
                }
                if (c == ',' && !inQuotes) {
                    result += ";";
                } else {
                    result += c;
                }
            }
            System.out.println(result);
            line = keyboard.nextLine();
        }
    }
}