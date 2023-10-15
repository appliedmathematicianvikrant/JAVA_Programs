
import java.util.Scanner;

public class CircumeferenceArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double rad = in.nextDouble();
        double area = areaCalc(rad);
        double perimter = perimterCalc(rad);
        System.out.printf("The area of the circle is %.1f ", area);
        System.out.println();
        System.out.printf("The perimeter of the circle is %.1f", perimter);
    }

    public static double areaCalc(double rad){
        return Math.PI * rad * rad;
    }
    public static double perimterCalc(double rad){
        return 2 * Math.PI * rad;
    }
}
