
import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total runs scored by the batsman");
        int run = in.nextInt();
        System.out.println("Enter the number of matches he played");
        int numMatches = in.nextInt();
        double avg = run / numMatches;
        System.out.printf("The average runs are %.1f ", avg);

    }
}
