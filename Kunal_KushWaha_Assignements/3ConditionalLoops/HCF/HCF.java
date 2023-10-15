
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        if(num1 % num2 == 0){
            System.out.println("The HCF of these numbers is "+ num2);
            System.exit(0);
        }else if (num2 % num1 == 0){
            System.out.println("The HCF of these numbers is "+ num1);
            System.exit(0);
        }

        int min = num1 > num2? num2:num1;
        int max = 1;
        for(int i = 2; i <= min; i++){
            if(num1 % i == 0 & num2 % i == 0){
                max = i;
            }
        }
        System.out.println("The HCF of these two numbers is "+ max);
    }
}
