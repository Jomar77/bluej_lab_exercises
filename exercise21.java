import java.util.Scanner;

public class exercise21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String line = input.nextLine();
        while (!line.equals("#")) {
            Scanner lineScanner = new Scanner(line);
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextInt()) {
                    sum = sum + lineScanner.nextInt();
                }   else {
                    lineScanner.next();
                }
            }
            System.out.println(sum);
            sum = 0;
            line = input.nextLine();
        }
    }
}