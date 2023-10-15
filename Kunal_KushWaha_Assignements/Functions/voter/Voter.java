
import java.util.Scanner;

public class Voter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the age of the candidate");
        int age = in.nextInt();
        boolean result = Voter(age);
        if(result){
            System.out.println("Yes you are eligible to vote");
        }else{
            System.out.println("You cano not vote");
        }

    }
    public static boolean Voter(int age){
        if(age >= 18){
            return true;
        }
        return false;
    }
}
