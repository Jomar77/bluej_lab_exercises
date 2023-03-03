/* 
Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Each line contains a series of integers
Write out the smallest and largest number in each line as shown in the
example
• You can assume there will always be at least one number on the
line
• Do not output a result for the line containing the # */

import java.util.Scanner;

public class exercise24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int smallest = 0;
        int largest = 0;
        int number = 0;
        int current = 0;
        System.out.println("Enter a series of numbers, terminated by a #");
        String line = input.nextLine();
        while (!line.equals("#")) {
            Scanner lineScanner = new Scanner(line);
            while(lineScanner.hasNext()) {
                if(lineScanner.hasNextInt()) {
                    number = lineScanner.nextInt();
                    if (current == 0) {
                        smallest = number;
                        largest = number;
                        current++;
                    }
                } else {
                    lineScanner.next();
                }
                if (number <= smallest) {
                    smallest = number;
                }
                if (number >= largest) {
                    largest = number;
                }
            }
            System.out.println("Min: " + smallest +" Max: " + largest);

            largest = 0;
            smallest = 0;
            current = 0;
            System.out.println("Enter a series of numbers, terminated by a #");
            line = input.nextLine();
        }
    }
}