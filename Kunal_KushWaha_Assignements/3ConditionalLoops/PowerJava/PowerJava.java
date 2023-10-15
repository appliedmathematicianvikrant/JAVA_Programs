
import java.util.Scanner;

public class PowerJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base value");
        int base = in.nextInt();
        System.out.println("Enter the power you want to calculate");
        int pow = in.nextInt();
        int result = 1;
        for(int i = 1; i <=pow; i++){
            result = result * base;
        }
        System.out.println(base+ " raised to power "+ pow+ " is "+ result);

    }
}
