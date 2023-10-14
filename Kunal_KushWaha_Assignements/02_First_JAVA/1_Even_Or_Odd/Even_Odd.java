
import java.util.Scanner;

public class Even_Odd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        float num = in.nextFloat();

        // Checking if the number is even or odd
        if ((num % 2) == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }

}
