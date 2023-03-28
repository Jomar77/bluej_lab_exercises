import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        String[] words = new String[0];
        double area = 0;
        line = input.nextLine();
        while (!line.equals("#")) {
            words = line.split(" ");
            if (words[0].equals("C")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[1]) * 3.14159265;
            } else if (words[0].equals("R")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[2]);
            } else if (words[0].equals("T")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[2]) / 2;
            } else if (words[0].equals("S")) {
                area = Double.parseDouble(words[1]) * Double.parseDouble(words[1]);
            }
            System.out.printf("%.1f%n", area);
            area = 0;
            line = input.nextLine();
        }

    }
}