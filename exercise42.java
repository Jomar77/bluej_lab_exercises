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

    public static void main(String[] args) throws IOException {
        HashMap<String, String> morseCode = new HashMap<String, String>();
        BufferedReader br = new BufferedReader(new FileReader("morse.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(" ");
            morseCode.put(parts[0], parts[1]);
        }
        br.close();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("#")) {
            String[] words = input.split(" ");
            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    System.out.print(morseCode.get(word.substring(i, i + 1).toUpperCase()) + " ");
                }
                System.out.print("   ");
            }
            System.out.println();
            input = sc.nextLine();
        }
        sc.close();
    }
}