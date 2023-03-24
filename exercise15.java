    import java.util.Scanner;

    public class exercise15
    {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            String line;
            int a = 0;
            int e = 0;
            int i = 0;
            int o = 0;
            int u = 0;
            line = input.nextLine();
            line = line.toLowerCase();
            while (!line.equals("#"))
            {
                for (int j = 0; j < line.length(); j++)
                {
                    char ch = line.charAt(j);
                    if (ch == 'a')
                    {
                        a++;
                    }
                    else if (ch == 'e')
                    {
                        e++;
                    }
                    else if (ch == 'i')
                    {
                        i++;
                    }
                    else if (ch == 'o')
                    {
                        o++;
                    }
                    else if (ch == 'u')
                    {
                        u++;
                    }
                }
                System.out.println("a:" + a + ",e:" + e + ",i:" + i + ",o:" + o + ",u:" + u);
                a = 0;
                e = 0;
                i = 0;
                o = 0;
                u = 0;
                line = input.nextLine();
            }
        }
    }