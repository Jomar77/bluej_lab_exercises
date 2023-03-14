import java.util.Scanner;
public class exercise2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.printf("%d + %d = %d %n", a,b,a+b);
        System.out.printf("%d - %d = %d %n", a,b,a-b);
        System.out.printf("%d x %d = %d %n", a,b,a*b);
        
    }
}