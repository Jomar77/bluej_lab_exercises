/*
 * Write a program that reads in a series of names terminated by a line
containing a single # and writes the names out in alphabetical order.
There will be no more than 200 names.
Do not include the line with the # in the sorted output.
(Hint Use an ArrayList)

 */
import java.util.ArrayList;
import java.util.Scanner;
public class exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        System.out.println("Enter your names:");
        String name = input.nextLine();
        while (!name.equals("#")) {
            names.add(name);
            name = input.nextLine();
        }
        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size() - 1; j++) {
                if (names.get(j).compareTo(names.get(j + 1)) > 0) {
                    String temp = names.get(j);
                    names.set(j, names.get(j + 1));
                    names.set(j + 1, temp);
                }
            }
        }
        for (String s : names) {
            System.out.println(s);
        }
    }
}
