
import java.util.Scanner;

public class PerimiterCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double rad = in.nextDouble();
        double perimeter = 2 * Math.PI * rad ;
        System.out.printf("The perimter of the circle is  %.1f", perimeter); 
    }
}
