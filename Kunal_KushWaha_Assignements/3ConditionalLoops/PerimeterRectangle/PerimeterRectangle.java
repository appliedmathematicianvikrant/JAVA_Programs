
import java.util.Scanner;
public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double breadth = in.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimter of the rectangle is "+ perimeter);
    }
}
