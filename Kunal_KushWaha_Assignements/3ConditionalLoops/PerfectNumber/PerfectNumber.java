
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        boolean result = perfect(num);
        if(result){
            System.out.println(num+" is a perfect number");
        }else{
            System.out.println(num+" is not a perfect number");
        }
    }
    public static boolean perfect(int n){
        int sum = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(n == sum){
            return true;
        }
        return false;
    }
}
