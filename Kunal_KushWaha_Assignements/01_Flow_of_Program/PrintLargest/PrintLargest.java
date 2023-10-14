import java.util.Scanner;

public class PrintLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1 = in.nextFloat();
        System.out.println("Enter the second number");
        float num2 = in.nextFloat();
        System.out.println("The maximum of these two numbers is "+(num1 > num2? num1: num2));

    }

}
