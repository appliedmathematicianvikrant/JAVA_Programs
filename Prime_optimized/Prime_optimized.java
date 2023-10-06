import java.util.Scanner;

public class Prime_optimized {
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to check for prime");
        int num = in.nextInt();
        boolean res = prime(num);
        if(res){
            System.out.println("The entered number is prime.");
        }else{
            System.out.println("The entered number is not prime.");
        }

    }

    public static boolean prime(int num){
        for(int i = 2; i * i < num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
