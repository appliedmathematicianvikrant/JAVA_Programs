
import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        double sum = 0;

        do{
            System.out.println("Enter the number, enter 0 to exit");
            double num = in.nextDouble();
            if(num == 0){
                flag = false;
                break;
            }
            sum += num;
           
        }while(flag == true);

        System.out.println("Sum of the numbers you entered is "+ sum);
    }
}
