

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you want to find the average of ");
        int n = in.nextInt();
        double sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println("Enter the number");
            sum += in.nextDouble();
        }
        System.out.println("The average of these numbers is "+ (sum/n));

    }
}
