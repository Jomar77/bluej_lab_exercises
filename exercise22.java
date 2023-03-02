import java.util.Scanner;

public class exercise22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        String[] words = new String[0];
        System.out.println("Enter a line of text terminated by a #");
        String line = input.nextLine();
        while (!line.equals("#")) {
            Scanner lineScanner = new Scanner(line);
            words = line.split(",");
            while (lineScanner.hasNext()) {
                if (lineScanner.hasNextInt()) {
                    for (int j = 2; j < words.length; j++) {
                        a = a + lineScanner.nextInt();
                    }
                } else {
                    lineScanner.next();
                }
            }
            System.out.printf("%s %s %d", words[1], words[0], a);
            a = 0;
            System.out.println("Enter a line of text terminated by a #");
            line = input.nextLine();
        }
    }
}
