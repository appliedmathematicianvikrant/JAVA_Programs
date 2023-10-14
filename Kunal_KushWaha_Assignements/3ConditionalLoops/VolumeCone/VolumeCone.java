
import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the base of the cone");
        double radius = in.nextDouble();
        System.out.println("Enter the height of the cone");
        double height = in.nextDouble();
        double volume = (1 /3) * Math.PI * radius * radius * height;
        System.out.println("The volume of the cone is "+ volume);
    }
}
