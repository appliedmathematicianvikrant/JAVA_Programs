
import java.util.Scanner;

public class AreaEquilateral {
        public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the equal side of the triangle");
        double length = in.nextDouble();
        double area = (Math.sqrt(3)/ 4) * length * length;
        System.out.printf("The area of the equilateral traingle is %.1f ", area);
    }  
}
