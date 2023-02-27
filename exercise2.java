import java.util.Scanner;
public class exercise2 {
    
    public static void main(String[] args) {
        //Read, from standard input two integer numbers and write out their sum, difference and product as shown in the example (use single spaces for separators)
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        
    }
}