import java.util.Scanner;
import java.util.Arrays;

public class exercise25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int len = 0;
        String [] words = new String[0];
        len = input.nextInt();
        words = new String[len];
        
        input(words, len);
        Arrays.sort(words);

        for (int i = 0; i < len; i++) {
            System.out.println(words[i]);
        }
    }

    public static void input(String[] words, int len) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            words[i] = input.next();
        }
    }
}
