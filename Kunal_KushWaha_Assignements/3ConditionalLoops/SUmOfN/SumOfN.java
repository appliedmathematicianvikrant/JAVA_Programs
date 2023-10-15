

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you want to find sum of");
        int n = in.nextInt();
        double sum = 0;
        for(int i = 1; i <= n ; i++){
            System.out.println("Enter the number");
            double num = in.nextDouble();
            sum += num;
        }
        System.out.println("The sum of these numbers is "+ sum);
    }
}
