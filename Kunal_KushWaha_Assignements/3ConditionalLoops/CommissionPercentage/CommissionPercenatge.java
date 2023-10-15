import java.util.Scanner;

public class CommissionPercenatge {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the sales revenue");
        double salesRevenue = in.nextDouble();
        System.out.println("Enter the commission rate");
        double interestRate = in.nextDouble();
        double commission = salesRevenue * interestRate;
        System.out.println("Total commission is "+ commission);
    }
}
