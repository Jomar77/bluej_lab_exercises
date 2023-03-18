import java.util.Scanner;

public class exercise13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String reverse = "";
        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();
        while (!line.equals("#")) {
            for (int i = line.length()-1; i >= 0; i--) {
                reverse = reverse + line.charAt(i);
            }
            System.out.println(reverse);
            reverse = "";
            line = input.nextLine();
        }
    }
}