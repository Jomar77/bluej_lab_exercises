/*
Write a program that reads in a series of positive integers terminated by a
-1
Output the numbers in ascending numerical order – one number per line
Do not include the line with the-1 in the sorted output.
(Hint Use an ArrayList)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class exercise28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println("Enter your numbers:");
        int number = input.nextInt();
        while (number != -1) {
            numbers.add(number);
            number = input.nextInt();
        }
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}