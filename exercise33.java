
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class exercise33 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> namesinput = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new FileReader("names.txt"));
        String line = reader.readLine();
        while (line != null) {
            names.add(line);
            line = reader.readLine();
        }
        reader.close();
        System.out.println("Enter your names:");
        String name = input.nextLine();
        while(!name.equals("#")){
            namesinput.add(name);
            name = input.nextLine();
        }
        for (int i = 0; i < namesinput.size(); i++) {
            int count = 0;
            for (int j = 0; j < names.size(); j++) {
                if (namesinput.get(i).equals(names.get(j))) {
                    count++;
                }
            }
            System.out.println(namesinput.get(i) + ":" + count);
        }
    }
}