/* Write a program which reads in a series of marks entered as floating point
numbers (type double) and terminated by a -1.
Calculate the average mark
Output each mark on a line by itself and to a precision of 2 decimal
places, and beside each mark output and appropriate grade: BELOW
AVERAGE, AVERAGE or ABOVE AVERAGE
Marks range from 0 to 100 and there will be no more than 200 marks
entered.
Do not output a result for the line containing the -1
(Hint Use an ArrayList) */

import java.util.ArrayList;
import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> marks = new ArrayList<Double>();
        System.out.println("Enter your marks:");
        double mark = input.nextDouble();
        while (mark != -1 && mark >= 0 && mark <= 100 && marks.size() < 200) {
            marks.add(mark);
            mark = input.nextDouble();
        }
        double total = 0;
        for (double i : marks) {
            total += i;
        }
        double average = total / marks.size();
        System.out.println("Average: " + average);
        for (double i : marks) {
            if (i < average) {
                System.out.println(i + " BELOW AVERAGE");
            } else if (i > average) {
                System.out.println(i + " ABOVE AVERAGE");
            } else {
                System.out.println(i + " AVERAGE");
            }
        }
    }
}
