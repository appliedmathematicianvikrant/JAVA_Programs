
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        boolean result = prime(num);
        if(result){
            System.out.println("The number you entered is prime");
        }else{
            System.out.println("The number you have entered is not prime");
        }

    }
    public static boolean prime(int num){
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num% i ==0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
}
