/*Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line contains names and a series of test scores in the format
Surname,Firstname, score1, score2, score3, score4 etc
You are to output results in the format Firstname Surname TotalScore
There could be any number of scores.
If there are no scores the total is of course 0
Do not output a result for the line containing the #
(Hint Use hasNextInt)
*/

import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = "";
        String firstname = "";
        String surname = "";
        int total = 0;
        int score = 0;

        System.out.print("Enter a line of text terminated by a # : ");
        line = scan.nextLine();
        while(!line.equals("#"))
        {
            Scanner scanLine = new Scanner(line);
            scanLine.useDelimiter(",");
            surname = scanLine.next();
            firstname = scanLine.next();
            while(scanLine.hasNextInt())
            {
                score = scanLine.nextInt();
                total = total + score;
            }
            System.out.println(firstname + " " + surname + " " + total);
            total = 0;
            System.out.print("Enter a line of text terminated by a # : ");
            line = scan.nextLine();
        }
    }
}