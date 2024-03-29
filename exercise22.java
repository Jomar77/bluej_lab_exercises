import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = ""; 

        line = scan.nextLine();
        while(!line.equals("#"))
        {
            Scanner scanLine = new Scanner(line);
            scanLine.useDelimiter(",");
            System.out.println(Name(scanLine) + " " + total(scanLine));
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

    public static String Name(Scanner scanLine){
        String firstname = "";
        String surname = "";
        String name = "";

            surname = scanLine.next();
            firstname = scanLine.next();

            name =  surname + " " + firstname;
        
        return name;
    }
}