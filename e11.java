/**
 * This file will count the asterisks in an input
 * 
 * 
 * 
 */


import java.util.Scanner;

public class e11{
    public static void main(String args []){
        int count = 0;
        Scanner s = new Scanner(System.in); // declare 
        String input = s.nextLine();
        // loop until #
        while(!input.equals("#")){
            for(int i = 0; i < input.length(); i++){
            // if(input is equal to * = count + 1)
            if(input.charAt(i) == '*'){
                count++;
            }
        }
            System.out.println(count);
            count = 0;
            input = s.nextLine();
        }
    }
}