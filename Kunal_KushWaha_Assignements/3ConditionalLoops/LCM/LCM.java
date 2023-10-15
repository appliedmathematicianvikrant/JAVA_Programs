
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = in.nextInt();
        System.out.println("Enter the second number");
        int num2 = in.nextInt();
        if (num1 % num2 == 0) {
            System.out.println("The LCM of these two numbers is " + num1);
            System.exit(0);
        } else if (num2 % num1 == 0) {
            System.out.println("The LCM of these two numbers is " + num2);
            System.exit(0);
        }
        int max = num1 > num2 ? num1 : num2;
        int min = num1 < num2 ? num1 : num2;
        boolean flag = true;
        while (flag) {
            int i = 2;
            if (max * i % min == 0) {
                System.out.println("The LCM of these two numbers is " + max * i);
                flag = false;
            }
        }
    }
}
