
import java.util.Scanner;

public class CurvedCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height = in.nextDouble();
        double area = 2 * Math.PI * radius * height;
        System.out.printf("The curved surface area of the cylinder is %.1f ", area);
    }
}
