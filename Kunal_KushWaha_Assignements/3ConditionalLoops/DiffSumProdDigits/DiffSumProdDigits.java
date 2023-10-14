
import java.util.Scanner;
public class DiffSumProdDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int res = subtractProductAndSum(n);
        System.out.println("The difference between the sum and the product of the digits is " + res);
    }

    public static int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while (temp != 0) {
            int rem = temp % 10;
            sum += rem;
            prod *= rem;
            temp = temp / 10;
        }

        return (prod - sum);
    }
}
