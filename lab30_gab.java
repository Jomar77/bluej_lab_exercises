import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * This program reads in a series of lines terminated by a single '#'.Each
 * line contains a series of integers in ascending order. The integers will
 * range from 0 to 99. There will be at least 1 number per line and there will
 * be no more than 20 integers per line.
 *
 * @author Gabryel Cruz
 * @version 1.0 18/10/2023
 */
public class lab30_gab {
    /**
     * This is the entry point of the program.
     */
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        // to store the num entered by the user.
        Scanner table = new Scanner(System.in);
        String number = table.nextLine();
        while (true) {
            if (number.equals("#")) {
                break;
            }
            String[] numbers = number.split(" ");
            for (String numerals : numbers) {
                int num = Integer.parseInt(numerals);
                if (num < 0 || num > 99) {
                    break;
                } else {
                    nums.add(num);
                }
            }
            Collections.sort(nums);
            // Sort the ArrayList in ascending order
            String a = "";
            for (int num : nums) {
                a += Integer.toString(num) + " ";
            }

            System.out.println(a.trim());

            nums.clear();
            number = table.nextLine();
        }

        table.close();
    }
}