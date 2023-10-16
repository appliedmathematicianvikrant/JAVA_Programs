
import java.util.Scanner;

public class Palindroem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        String num = in.next();
        boolean result = palindrome(num);
        if(result){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is palindrome");
        }
    }

    public static boolean palindrome(String num){

        for(int i = 0; i < num.length(); i++){
            int j = num.length()-i-1;
            if(num.charAt(i)!= num.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
