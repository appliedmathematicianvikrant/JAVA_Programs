import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle");
        double length = in.nextDouble();
        System.out.println("Enter the breadth of the rectangle ");
        double breadth = in.nextDouble();
        double area = length * breadth;
        System.out.println("The area of the rectangle is "+ area);
    }
}
