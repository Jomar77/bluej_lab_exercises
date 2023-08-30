import java.util.Scanner;

public class e17gab {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = "";
        String firstname = "";
        String surname = "";
        int total = 0;
        int score = 0;

        line = scan.nextLine();
        while(!line.equals("#"))
        {
            Scanner scanLine = new Scanner(line);
            scanLine.useDelimiter(",");
            surname = scanLine.next();
            firstname = scanLine.next();
            System.out.println(firstname + " " + surname + " " + total(scanLine));
            total = 0;
            line = scan.nextLine();
        }
    }

    public static int total(Scanner scanLine) {
        int total = 0;
        int score = 0;
        while(scanLine.hasNextInt())
            {
                score = scanLine.nextInt();
                total = total + score;
            }
        return total;
    }
}