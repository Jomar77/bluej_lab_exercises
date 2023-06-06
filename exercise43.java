import java.util.Scanner;

public class exercise43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        while (!line.equals("#")) {
                String convertedLine = convertLine(line);
                System.out.println(convertedLine);
            line = scanner.nextLine();
        }
    }

    private static String convertLine(String line) {
        StringBuilder result = new StringBuilder();
        boolean insideQuotes = false;

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if (c == '"') {
                insideQuotes = !insideQuotes;
            }

            if (c == ',' && !insideQuotes) {
                result.append(';');
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
