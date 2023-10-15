
import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till you want the sum");
        int num = in.nextInt();
        int result = sum(num);
        System.out.println("The sum is " + result);
    }
    public static int sum(int num){
        return (num * (num + 1))/2;
    }
}
