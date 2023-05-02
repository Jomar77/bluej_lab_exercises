
/**
 * Write a description of class e17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class e16{
    // instance variables - replace the example below with your own
    
    public static void main (String args[]){
        sampleMethod();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sampleMethod()
    {
    
        int sum = 0;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        Scanner kb = new Scanner (input).useDelimiter(",");
        
        while(!input.equals("#")){
         while(kb.hasNextInt()){  
                sum = sum + kb.nextInt();  
            }   
        System.out.println(kb.nextLine() + " " + sum/4);
        input = kb.nextLine();
        }
    }
}
