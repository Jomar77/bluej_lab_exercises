/*Read, from standard input, a person’s first name, family name and their home location
– each on a separate line
Write a greeting to that person in the form
Hello first-name family-name of location
(use single spaces for separators)*/

/* 
 * Author  : @Jomar77
 * Version : @2020-10-05
 */

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your First Name:");
        String firstName = input.nextLine();
        System.out.println("Enter your Family Name:");
        String familyName = input.nextLine();
        System.out.println("Enter your Location:");
        String location = input.nextLine();
        System.out.println("Hello " + firstName + " " + familyName + " of " + location);
    }
}