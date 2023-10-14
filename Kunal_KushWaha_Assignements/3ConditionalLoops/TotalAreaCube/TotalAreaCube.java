
import java.util.Scanner;

public class TotalAreaCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the cube");
        double side = in.nextDouble();
        double volume = 6 * side * side;
        System.out.println("The total surface area of the cube is "+ volume);
    }
}
