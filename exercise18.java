import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String[] words = new String[0];
        double area = 0;

        System.out.println("Enter a line of text terminated by a #");
        line = input.nextLine();

        while (!line.equals("#")) {
            words = line.split(" ");
            if (words[0].equals("C")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[1]) * 3.14;
            } else if (words[0].equals("R")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[2]);
            } else if (words[0].equals("T")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[2]) / 2;
            } else if (words[0].equals("S")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[1]);
            }else{
                System.out.println("Invalid shape");
            }
            System.out.println("Area: " + area);
            area = 0;
            System.out.println("Enter a line of text terminated by a #");
            line = input.nextLine();
        }

    }
}