import java.util.Scanner;

public class exercise22 {
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
            while(scanLine.hasNextInt())
            {
                score = scanLine.nextInt();
                total = total + score;
            }
            System.out.println(firstname + " " + surname + " " + total);
            total = 0;
            line = scan.nextLine();
        }
    }
}