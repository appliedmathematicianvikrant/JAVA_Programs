
import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the side of the base");
        double side = in.nextDouble();
        System.out.println("Enter the height of the prism");
        double height = in.nextDouble();
        double volume = (Math.sqrt(3)/4) * side * side * height;
        System.out.printf("The volume of the prism is %.1f ", volume);
    }
}
