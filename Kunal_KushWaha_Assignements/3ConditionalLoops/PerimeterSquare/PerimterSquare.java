
import java.util.Scanner;

public class PerimterSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the square");
        double side = in.nextDouble();
        double perimeter = 4 * side;
        System.out.println("The perimter of the square is "+ perimeter);
    }
}
