import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = in.nextFloat();
        System.out.println("Enter the number of years ");
        int yrs = in.nextInt();
        System.out.println("Enter the interest rate compounded annually");
        double rate = in.nextDouble();
        double interest = (principal * rate * yrs)/100;
        System.out.println("The interest for this amount is "+ interest);

    }
}
