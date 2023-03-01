import java.util.Scanner;

public class exercise20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] linearr = new String[0];
        int sum = 0;
        System.out.println("Enter a line of text terminated by a #");
        String line = input.nextLine();
        while (!line.equals("#")) {
            if (line.isBlank()) {
                linearr[0] = "0";
            } else {
                linearr = line.split(" ");
            }
            System.out.println(linearr.length);
            for (int i = 0; i < linearr.length; i++) {
                sum = sum + Integer.parseInt(linearr[i]);
            }
            System.out.println("Sum: " + sum);

            sum = 0;
            linearr = new String[0];
            System.out.println("Enter a line of text terminated by a #");
            line = input.nextLine();
        }
    }
}
