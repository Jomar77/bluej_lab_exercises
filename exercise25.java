import java.util.Scanner;
import java.util.Arrays;

public class exercise25 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int len = 0;
        len = input.nextInt();
        String [] words = new String[len];
        for (int i = 0; i < len; i++) {
            words[i] = input.next();
        }
        Arrays.sort(words);

        for (int i = 0; i < len; i++) {
            System.out.println(words[i]);
        }

}

}