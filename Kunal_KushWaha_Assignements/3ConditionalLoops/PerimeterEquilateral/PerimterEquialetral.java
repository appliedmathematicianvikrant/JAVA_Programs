import java.util.Scanner;

public class PerimterEquialetral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the side of the equilateral traingle");
        double side = in.nextDouble();
        double perimeter =  3 * side;
        System.out.println("The perimeter of the traingle is "+ perimeter);
    }
}
