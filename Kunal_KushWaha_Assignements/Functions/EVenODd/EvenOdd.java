

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        boolean result = EvenOdd(num);
        if(result){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }

    public static boolean EvenOdd(int n){
        if(n % 2 == 0){
            return true;
        }
        return false;
    }
}
