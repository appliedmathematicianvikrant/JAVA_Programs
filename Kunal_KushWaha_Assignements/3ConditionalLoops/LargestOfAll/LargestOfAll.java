
import java.util.Scanner;

public class LargestOfAll {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Enter the number, enter 0 to exit");
        int num = in.nextInt();
        if(num == 0){
            System.out.println("You have not entered any number");
            System.exit(0);
        }
        int max = num;

        do{
            System.out.println("Enter the number, enter 0 to exist");
            num = in.nextInt();
            if(num == 0){
            flag = false;
        }
            if(num > max){
                max = num;
            }
        }while(flag);
        System.out.println("The maximum of all the integers is "+ max);
    }
}
