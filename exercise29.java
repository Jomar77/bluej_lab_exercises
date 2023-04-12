import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class exercise29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        String name = input.nextLine();
        while (!name.equals("#") && names.size() < 200) {
            names.add(name);
            name = input.nextLine();
        }
        Collections.sort(names);
        for (String s : names) {
            System.out.println(s);
        }
    }
}
