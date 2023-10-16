
import java.util.Scanner;

public class PythaogoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
       
        if((num1 * num1) == (num2 * num2)+ (num3 * num3)) {
            System.out.println("These are pythagorean triplets");
        }else if ((num2 * num2) == (num1 * num1)+ (num3 * num3)){
            System.out.println("These are pythagorean triplets");
        }else if ((num3 * num3) == (num1 * num1)+ (num2 * num2)){
            System.out.println("These are pythagorean triplets");
        }else{
            System.out.println("These are not pythagorean triplets");
        }
    }   
}
