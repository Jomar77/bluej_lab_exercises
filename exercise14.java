import java.util.Scanner;

public class exercise14
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String line;
        int counter = 0;
        line = input.nextLine();
        while (!line.equals("#"))
        {
            for (int i = 0; i < line.length(); i++)
            {
                char ch = line.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                {
                    counter++;
                }
            }
            System.out.println(counter);
            counter = 0;
            line = input.nextLine();
        }
    }
}