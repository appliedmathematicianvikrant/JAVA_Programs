

import java.util.Scanner;

public class FutureInvestMent {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the initial money");
        double p = in.nextDouble();
        System.out.println("Enter the rate of interest");
        double r = in.nextDouble();
        System.out.println("Enter the years");
        int yr = in.nextInt();
        double Amount = p;
        for(int i = 1; i <= yr; i++){
            Amount = Amount * (1+(r/100));
        }
        System.out.printf("The net amount you will get is %.1f", Amount);

    }
}
