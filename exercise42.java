/*
Laboratory Exercise 42 – Morse Code Generator
The file morse.txt is a text file containing letter code pairs based on the
Morse Code table below. It uses a full stop for a dot and a hyphen for a
dash.
Morse Code table from http://en.wikipedia.org/wiki/Morse_code
Write a program that
(a) reads the text file and creates a HashMap with the letter as the key and
the code as the data.
(b) reads in a series of lines from standard input until a line with only a #
is reached
For each line it should output the morse code for each word on the line
with one space between each morse character and three spaces between
each word.
Ignore case in the line from standard input.
Do not process the line with the #
Sample Input Sample Output
Hello World …. . .-.. .-.. --- .-- --- .-. .-.. -..
Today is sunny - --- -.. .- -.-- .. ... ... ..- -. -. -.--
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class exercise42 {
    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("morse.txt"));
            String line = in.readLine();
            HashMap<String, String> morse = new HashMap<String, String>();
            while (line != null) {
                String[] data = line.split(":");
                String letter = data[0];
                String code = data[1];
                morse.put(letter, code);
                line = in.readLine();
            }
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Put ");
            line = keyboard.nextLine();
            while (!line.equals("#")) {
                String[] data = line.toUpperCase().split(" ");
                for (int i = 0; i < data.length; i++) {
                    String word = data[i];
                    for (int j = 0; j < word.length(); j++) {
                        String letter = word.substring(j, j + 1);
                        System.out.print(morse.get(letter));
                    }
                    System.out.print(" ");
                }
                System.out.println();
                line = keyboard.nextLine();
            }
        } catch (IOException e) {
            System.out.println("Error processing file: " + e);
        }
    }
}