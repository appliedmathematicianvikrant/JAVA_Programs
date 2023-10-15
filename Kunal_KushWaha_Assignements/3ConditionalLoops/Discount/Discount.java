
import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double discPercntg = 0.098;
        System.out.println("Enter the MRP");
        double mrp = in.nextDouble();
        double netPrice = mrp - mrp * discPercntg;
        System.out.println("The net price after applying the discount is "+ netPrice);

    }
}
