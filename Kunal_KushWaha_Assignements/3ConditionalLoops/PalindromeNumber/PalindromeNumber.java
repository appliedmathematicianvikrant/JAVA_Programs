
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        String number = in.next();
        int length = number.length();
        for(int i = 0; i < length; i++){
            int j = length - i -1;
            if(number.charAt(i)!= number.charAt(j)){
                System.out.println("The number is not palindrome");
                System.exit(0);
            }
        }
        System.out.println("The number is palindrome");
    }
}
