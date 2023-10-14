
import java.util.Scanner;

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first side of the parallelogram");
        double firstSide = in.nextDouble();
        System.out.println("Enter the second side of the parallelogram");
        double secondSide = in.nextDouble();
        double perimeter = 2 * (firstSide + secondSide);
        System.out.println("Enter the perimeter of the parallelogram is "+ perimeter);

    }
}
