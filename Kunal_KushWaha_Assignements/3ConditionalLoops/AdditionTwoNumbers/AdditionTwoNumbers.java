
import java.util.Scanner;
public class AdditionTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = in.nextDouble();
        System.out.println("Enter the second number");
        double num2 = in.nextDouble();
        double sum = num1 + num2;
        System.out.println("The sum of these two numbers is "+ sum);
    }
}
