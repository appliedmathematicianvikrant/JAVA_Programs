
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        int sumPosEven = 0;
        int sumPosOdd = 0;
        int sumNeg = 0;
        int sumNeg;

       do{
        System.out.println("Enter the number,enter 0 if you want to exit");
        int num = in.nextInt();
        
        if(num == 0){
            System.out.println("The sum of the positive numbers is "+ sumPosEven);
        }
       }while(flag);
    }
}
