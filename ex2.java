import java.util.Scanner;

public class ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String line = sc.nextLine();
        String [] in = line.split(" ");

        int value = Integer.parseInt(in[0]);
        if(in[1].equals("left")){
            value = value << Integer.parseInt(in[2]);
        }
        else{
            value = value >> Integer.parseInt(in[2]);  
        }
        System.out.println(value);
    }
}