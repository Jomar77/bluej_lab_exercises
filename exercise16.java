import java.util.Scanner;

public class exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int j = 0;
        int a = 0;
        line = input.nextLine();
        while (!line.equals("#")) {
            for (j = 0; j < line.length(); j++) {
                if (line.charAt(j) == '*') {
                    a++;
                }else if (line.charAt(j) == '!') {
                    break;
                }
            }
            System.out.println(a);
            a = 0;
            line = input.nextLine();
        }
    }
}