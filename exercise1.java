/*Read, from standard input, a person’s first name, family name and their home location
– each on a separate line
Write a greeting to that person in the form
Hello first-name family-name of location
(use single spaces for separators)*/

import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String familyName = input.nextLine();
        String location = input.nextLine();
        System.out.println("Hello " + firstName + " " + familyName + " of " + location);
    }
}