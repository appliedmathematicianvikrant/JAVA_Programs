
import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        PrimeCalculator(num1, num2);
    }

    public static void PrimeCalculator(int num1, int num2){
        for(int test= num1; test <= num2; test++){
            int count = 0;
            for(int i = 1; i <= test; i++){
                
                if(test % i ==0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(test);
            }
        }
    }
}
