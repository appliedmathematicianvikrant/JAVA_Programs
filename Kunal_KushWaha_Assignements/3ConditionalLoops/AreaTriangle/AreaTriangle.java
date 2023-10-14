
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base of the triangle");
        double base = in.nextDouble();
        System.out.println("Enter the height of the triangle");
        double height = in.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is "+ area);
    }
}
