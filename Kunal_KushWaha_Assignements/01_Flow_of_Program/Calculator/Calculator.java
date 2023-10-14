import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNum = in.nextDouble();
        System.out.println("Enter the second number");
        double secondNum = in.nextDouble();
        System.out.println("Enter the operation");
        char operation =  in.next().charAt(0);
        if (operation == '+') {
            System.out.println("The sum of these two numbers is "+ (firstNum + secondNum));
        } else if(operation == '-'){
            System.out.println("The difference of these two numbers is "+ (firstNum > secondNum? firstNum - secondNum: secondNum - firstNum));
        }else if (operation == '*'){
            System.out.println("The product of these two numbers is "+ (firstNum * secondNum));
        }else{
            System.out.println("The division of two numbers is "+ (firstNum / secondNum));
        }

    }
}
