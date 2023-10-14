
import java.util.Scanner;

public class Isosceles {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the equal sides of the triangle");
        double a = in.nextDouble();
        System.out.println("Enter the base of the triangle");
        double b = in.nextDouble();
        double h = 0.5 * Math.sqrt(4 * a * a - b * b);
        double area =  0.5 * b * h;
        System.out.printf("The area of this isosceles triangle is %.f ", area);

    }
}
