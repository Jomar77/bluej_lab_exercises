/*
 * The file phonelist.txt contains a list of phone numbers and the person or
company associated with them..
Each line in the file contains a phone number (a string without spaces)
and a description of the person or company(which can have spaces)
Read the list and create a HashMap using the phone number as the key
and the description as the data


Sample file phonelist.txt
032149970 The Warehouse
021211234567 Anna Jones
0508446987 Hoyts
+6339876543 Australian Immigration

From standard input read a list of phone numbers
Each line contains a phone number from a telephone account
For each line output the phone number followed by its description.
The input data will end in a single line containing a #
Do not process the line with the # in it
If the phone number does not exist in the inventory then output
the phone number with the text “unknown” beside it

Sample Input Sample Output
021211234567 021211234567 Anna Jones
032149970 032149970 The Warehouse
+6339876543 +6339876543 Australian Immigration
021211234567 021211234567 Anna Jones

 */


import java.util.Scanner;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class exercise35 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("phonelist.txt"));
            String line = in.readLine();
            HashMap<String, String> phone = new HashMap<String, String>();
            while (line != null) {
                String[] data = line.split(" ");
                String number = data[0];
                String name = data[1];
                for (int i = 2; i < data.length; i++) {
                    name = name + " " + data[i];
                }
                phone.put(number, name);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put phone number:");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String name = phone.get(line);
                if (name == null) {
                    System.out.println(line + " unknown");
                } else {
                    System.out.println(line + " " + name);
                }
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}