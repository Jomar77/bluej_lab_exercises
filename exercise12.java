import java.util.Scanner;
public class exercise12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = "";
        int count = 1;
        line = input.nextLine();
        while (!line.equals("#")) {
            System.out.println(count(line, count));
            count = 1;
            line = input.nextLine();
        }
    }
    public static int count(String line, int count) {
        if (line.isEmpty()) {
            count = 0;
        }else if(!line.isEmpty())
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) ==  ' '){
                count++;
            }
        }
        return count;
    }
}