
import java.util.Scanner;

public class DistancePoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first coordiantes");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.println("Enter the second coordiantes");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double distance = Math.sqrt((x2 - x1)* (x2 - x1)+ (y2-y1)*(y2-y1));
        System.out.printf("The distance between these two points is %.1f",distance);
    }
}
