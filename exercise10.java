/*
Read, from standard input a single integer
Write out the times table of that integer from 1 times the number to 10 times the
number and formatted as shown below.*/

import java.util.Scanner;

public class exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Enter a number: ");
        number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.prinf(number + " times " + i + " is " + number * i);
        }
    }
}