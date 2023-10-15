
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = in.next();
        String result = "";
        int length = input.length();
        for(int i = 0; i< length; i++){
            int j = length - i-1;
            result = result + input.charAt(j);
        }
        System.out.println("The reversed string is "+ result);
    }
}
