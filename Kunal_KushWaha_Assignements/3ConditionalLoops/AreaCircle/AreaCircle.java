
import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double rad = in.nextDouble();
        double area = Math.PI * (rad * rad);
        System.out.printf("The area of the circle is %.0f ", area);
    }
}
