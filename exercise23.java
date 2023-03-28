import java.util.Scanner;

public class exercise23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        int winA = 0;
        int winB = 0;
        while (!line.equals("#")) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == 'A') {
                    winA++;
                } else if (line.charAt(i) == 'B') {
                    winB++;
                }
            }
            System.out.println("A " + winA +" " + "B " + winB);
            winA = 0;
            winB = 0;
            line = input.nextLine();
            winA = 0;
            winB = 0;
        }
    }
}
