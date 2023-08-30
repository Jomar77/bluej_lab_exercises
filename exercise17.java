
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
             System.out.printf("%.2f\n", sampleMethod(input));
             input = s.nextLine();
         }
         
     }
     
     public static double sampleMethod(String in)
     {
         Scanner scn = new Scanner(in);
         double area = 0;
         scn.useDelimiter(" ");
         String letter = scn.next();
         double num = scn.nextDouble();
         
         
         if(letter.equals("C")){
             area = 3.14 * num *num;
            }
            else if(letter.equals("S")) {
                area = num * num ;
            }
            else if (letter.equals("R")){
             double num2 = scn.nextDouble();
             area = num * num2;
            }
            else if(letter.equals("T")){
             double num2 = scn.nextDouble();
             area = (num * num2) /2;
         }
         return area;
     }
 }
 