
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the marks for Hindi");
        int mark1 = in.nextInt();
         System.out.println("Enter the marks for English");
        int mark2 = in.nextInt();
         System.out.println("Enter the marks for Maths");
        int mark3 = in.nextInt();
         System.out.println("Enter the marks for Science");
        int mark4 = in.nextInt();
         System.out.println("Enter the marks for Social Science");
        int mark5 = in.nextInt();
        int totalMarksObtained = mark1 + mark2 + mark3 + mark4 + mark5;
        int totalMarks = 500;
        double percentage = (totalMarksObtained / totalMarks) ;
        System.out.println(percentage);
        System.out.println("Hello");
        double CGPA = percentage / 9.5;
        System.out.println("Hello");
        System.out.println("Net CGPA is "+ CGPA);
        
    }
}
