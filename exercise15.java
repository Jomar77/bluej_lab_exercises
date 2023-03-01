/*Write a program that reads in a series of lines terminated by a line
containing only a single '#'
Output the number of times each vowel occurs in each line of input.
Output the results in the format lowercaseVowel:count with a comma
separating each vowel:count pair eg: a:3,e:0,i:2,o:4,u:1
Ignore the case of the vowels read (ie aAAaEe counts as
a:4,e:2,i:0,o:0,u:0)
Do not output a result for the line containing the #
(Hint Use for – counter controlled loop)
*/

import java.util.Scanner;

public class exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int j = 0;
        int a = 0;
        int i = 0;
        int e = 0;
        int o = 0;
        int u = 0;
        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();
        while (!line.equals("#")) {
            for (j = 0; j < line.length(); j++) {
                if (line.charAt(i) == 'a' || line.charAt(i) == 'A') {
                    a++;
                }else if (line.charAt(i) == 'e' || line.charAt(i) == 'E') {
                    e++;
                }else if (line.charAt(i) == 'i' || line.charAt(i) == 'I') {
                    i++;
                }else if (line.charAt(i) == 'o' || line.charAt(i) == 'O') {
                    o++;
                }else if (line.charAt(i) == 'u' || line.charAt(i) == 'U') {
                    u++;
                }
            }
            System.out.println("a:" + a + ",e:" + e + ",i:" + i + ",o:" + o + ",u:" + u);
            a = 0;
            e = 0;
            i = 0;
            o = 0;
            u = 0;
            line = input.nextLine();
        }
    }
}