

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first price");
        double P = in.nextDouble();
        System.out.println("Enter the depreciation rate");
        double r = in.nextDouble();
        System.out.println("Enter the years");
        int n = in.nextInt();
        double result = P;
        for(int i =1; i <=n; i++){
            result = result * (1 -(r/100));
        }
        System.out.printf("The depriciated value is %.1f ", result);

    }
}
