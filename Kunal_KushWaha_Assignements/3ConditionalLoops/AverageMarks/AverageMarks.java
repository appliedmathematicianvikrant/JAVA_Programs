
import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks for Hindi");
        double mark1 = in.nextDouble();
         System.out.println("Enter the marks for English");
        double mark2 = in.nextDouble();
         System.out.println("Enter the marks for Maths");
        double mark3 = in.nextDouble();
         System.out.println("Enter the marks for Science");
        double mark4 = in.nextDouble();
         System.out.println("Enter the marks for SST");
        double mark5 = in.nextDouble();
        double avgMark = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
        System.out.println("The average marks is "+ avgMark); 

    }
}
