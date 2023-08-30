
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
             System.out.printf("%.2f", sampleMethod(input));
             input = s.nextLine();
         }
         
     }
     
     public static double sampleMethod(String in)
     {
         Scanner scn = new Scanner(in);
         double area = 0;
         scn.useDelimiter(" ");
         String letter = scn.next();
        

         if(letter.equals("C")){
             area = 3.14 * scn.nextDouble();
         }
         else if(letter.equals("S") || letter.equals("R")){
             area = scn.nextDouble() * scn.nextDouble();
         }
         else if(letter.equals("T")){
             area = (scn.nextDouble() * scn.nextDouble()) /2;
         }
         return area;
     }
 }
 