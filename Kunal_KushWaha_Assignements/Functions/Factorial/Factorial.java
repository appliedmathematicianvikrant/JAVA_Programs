
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int result = fact(num);
        System.out.println("The factorail of this number is "+ result);
    }
    public static int fact(int num){
        int res = 1;
        for(int i = 1; i<= num; i++){
            res = res * i;
        }
        return res;
    }
}
