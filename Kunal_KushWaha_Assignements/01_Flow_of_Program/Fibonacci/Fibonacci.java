import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number till you want your fibonacci sequence");
        int nTh = in.nextInt();

        System.out.println("0\n1");
        int first = 0;
        int second = 1;
        for (int i = 1; i <= nTh - 2; i++) {
            int next = first + second;
            System.out.println(first + second);
            first = second;
            second = next;
        }
    }
}
