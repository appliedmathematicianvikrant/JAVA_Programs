
import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");
        double radius = in.nextDouble();
        double volume = (4/3) * Math.PI * radius * radius * radius;
        System.out.printf("The volume of the sphere is %.1f", volume);
    }
}
