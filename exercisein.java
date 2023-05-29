import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class exercisein{
    public static void main(String [] args) {
        
        try {
            Scanner scan = new Scanner(System.in);
            PrintWriter output = new PrintWriter(new File("nameadd.txt"));
            String line = scan.nextLine();
            while (!line.equals("#")) {
                String[] name = line.split(",");
                String lastName = name[0];
                String address = name[name.length-1];
                for (int i=1; i<name.length-1; i++) {
                    address = address + " " + name[i];
                }
                output.println("Name: " + lastName + ", Address:" + address);
                line = scan.nextLine();
            }
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}