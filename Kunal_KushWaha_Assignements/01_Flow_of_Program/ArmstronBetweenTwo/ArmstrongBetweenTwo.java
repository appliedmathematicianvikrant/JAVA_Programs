import java.util.Scanner;

public class ArmstrongBetweenTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        int first = in.nextInt();
        System.out.println("Enter the second number");
        int second = in.nextInt();

        for(int testNum = first; testNum <= second; testNum++){
            boolean res = IsArmstrong(testNum);
            if(res){
                System.out.println(testNum + " is an Armstrong number");
            }
        }
    }

    public static boolean IsArmstrong(int num){
        int test = num;
        int sum = 0;
        while(test!=0){
            int rem = test % 10;
            sum = sum + (rem* rem * rem);
            test = test / 10;
        }
        if (sum == num){
            return true;
        }
        return false;
    }
}
