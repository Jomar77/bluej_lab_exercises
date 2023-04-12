import java.util.ArrayList;
import java.util.Scanner;

public class exercise27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> marks = new ArrayList<Double>();
        double mark = input.nextDouble();
        while (mark != -1 && mark >= 0 && mark <= 100 && marks.size() < 200) {
            marks.add(mark);
            mark = input.nextDouble();
        }
        double total = 0;
        for (double i : marks) {
            total += i;
        }
        double average = total / marks.size();
        for (double i : marks) {
            grader(average,i);
        }
    }

    public static void grader(double average, double i){
        if (i < average) {
            System.out.println(i + " BELOW AVERAGE");
        } else if (i > average) {
            System.out.println(i + " ABOVE AVERAGE");
        } else {
            System.out.println(i + " AVERAGE");
        }
    }
}
