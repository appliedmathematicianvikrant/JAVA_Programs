
import java.util.Scanner;

public class MaxMinThree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double first = in.nextDouble();
        System.out.println("Enter the second number");
        double second = in.nextDouble();
        System.out.println("Enter the third number");
        double third = in.nextDouble();
        double max = maxCal(first, second, third);
        double min = minCal(first, second, third);
        System.out.println("The maximum of these three numbers is " + max);
        System.out.println("The minimum of these three numbers is " + min);

    }

    public static double maxCal(double first, double second, double third) {
        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else {
            return third;
        }
    }

    public static double minCal(double first, double second, double third) {
        if (first < second && first < third) {
            return first;
        } else if (second < first && second < third) {
            return second;
        } else {
            return third;
        }
    }
}
