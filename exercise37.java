/*
 * The file numberplates.txt contains a list of number plates and the
registered car owner for that number plate.
Each line in the file contains a number plate (a string without spaces), a
colon : and a name (a string which can have spaces)
Read the list and create a HashMap using the number plate as the key and
the name as the data
Sample file numberplates.txt
LZ3234:Harrison Ford
AA5323:Helen Mirren
ZA4334:Sarah Anne Smith
HG3245:Joe Brown
From standard input read a list of number plates
For each line output the registered owner for that number plate or
"Unregistered Car" if the number plate is not found.
The input data will end in a single line containing a #
Do not process the line with the # in it
Sample Input Sample Output
HG3245 Joe Brown
SD2234 Unregistered Car
ZA4334 Sarah Anne Smith
#
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise37 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("numberplates.txt"));
            String line = in.readLine();
            HashMap<String, String> numberplates = new HashMap<String, String>();
            while (line != null) {
                String[] data = line.split(":");
                String numberplate = data[0];
                String name = data[1];
                numberplates.put(numberplate, name);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put numberplate:");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                if (numberplates.containsKey(line)) {
                    System.out.println(numberplates.get(line));
                } else {
                    System.out.println("Unregistered Car");
                }
                System.out.println("Put numberplate:");
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}
