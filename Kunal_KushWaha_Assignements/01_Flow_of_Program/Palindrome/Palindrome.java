import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = in.next();
        int lenth = input.length();
        boolean flag = true;

        for(int i = 0; i < lenth ; i++){
            int j = lenth - 1- i;
            if(input.charAt(i) != input.charAt(j)){
                System.out.println("The string is not palindrome");
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.println("The string is palindrome");
        }
    }
}
