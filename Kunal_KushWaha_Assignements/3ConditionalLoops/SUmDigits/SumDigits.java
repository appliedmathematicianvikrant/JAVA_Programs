
import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();

        int result = sumDigits( num);
        System.out.println("Ths sum of the digits of the entered number is "+ result);

    }
    public static int sumDigits(int n){
        int temp = n;
        int sum = 0;
        while(temp !=0){
            int rem = temp % 10;
            sum += rem;
            temp = temp/10;
        }
        return sum;
    }
}
