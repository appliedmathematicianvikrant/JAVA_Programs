

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p = in.nextDouble();
        System.out.println("Enter the interest rate compouned annually");
        double r = in.nextDouble();
        System.out.println("Enter the amount of years");
        int yrs = in.nextInt();
        double result = p;
        for(int i = 1; i <= yrs; i++){
            result = result * (1+(r/100));
        }
        System.out.printf("The compound interest you will get is %.1f",(result - p));
    }
}
