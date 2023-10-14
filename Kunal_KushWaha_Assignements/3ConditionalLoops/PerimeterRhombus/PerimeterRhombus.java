
import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sie of the rhombus");
        double side = in.nextDouble();
        double perimeter = 4 * side;
        System.out.println("The perimter of the rhombus is "+ perimeter);
    }
}
