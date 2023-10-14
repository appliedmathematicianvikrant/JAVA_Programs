
import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the base of the cylinder");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the cylinder");
        double height = in.nextDouble();
        double volume = (Math.PI / 3) * radius * radius * height;
        System.out.printf("The volume of the cylinder is %.1f ", volume);
    }
}
