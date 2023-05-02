
/**
 * Write a description of class e18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

 import java.util.Scanner;
 public class exercise17
 {
     // instance variables - replace the example below with your own
     public static void main (String args[]){
         Scanner s =  new Scanner(System.in);
         String input = s.nextLine();
         
         while(!input.equals("#")){
             sampleMethod(input);
             input = s.nextLine();
         }
         
     }
     
     public static void sampleMethod(String in)
     {
         Scanner scn = new Scanner(in);
         double area = 0;
         scn.useDelimiter(" ");
         String letter = scn.nextLine();
         
         if(letter.equals("C")){
             area = 3.14 * scn.nextDouble();
         }
         else if(letter.equals("S") || letter.equals("R")){
             area = scn.nextDouble() * scn.nextDouble();
         }
         else if(letter.equals("T")){
             area = (scn.nextDouble() * scn.nextDouble()) /2;
         }
         System.out.println(area);
     }
 }
 