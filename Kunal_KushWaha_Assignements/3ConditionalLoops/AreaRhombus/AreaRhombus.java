
import java.util.Scanner;

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first diagonal of the rhombus");
        double diagOne = in.nextDouble();
        System.out.println("Enter the second diagonal of the rhombus");
        double diagTwo = in.nextDouble();
        double area = (diagOne * diagTwo) * 0.5;
        System.out.println("The area of the rhombus is "+ area);
    }
}
