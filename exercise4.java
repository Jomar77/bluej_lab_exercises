/*Read, from standard input, a name consisting of a surname followed by a first name
and separated by a single comma and a single space.
The output of should be the first name followed by the surname and separated by a
single space.
(Hint Use substring)
*/

import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the item");
        String name = input.nextLine();
        int comma = name.indexOf(", ");
        String surname = name.substring(0, comma);
        String firstname = name.substring(comma + 2);
        System.out.printf("%s %s", firstname, surname);
    }
}