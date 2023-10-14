import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount in Indian ruppe");
        double IndianRupee = in.nextDouble();
        System.out.println("The equiavelnt amount in Rupee is "+ (IndianRupee * 0.012));
    }
}
