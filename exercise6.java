/* Read, from standard input, a series of names each on a separate line and ending with a
sentinel value of # on a line of its own.
For each name output a line in the form Hello name as shown below
Do not process the sentinel value.
(Hint Use while – sentinel controlled loop) */

import java.util.Scanner;

public class exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Enter a name: ");
        name = input.nextLine();
        while (!name.equals("#")) {
            System.out.println("Hello " + name);
            System.out.println("Enter a name: ");
            name = input.nextLine();
        }
    }
}