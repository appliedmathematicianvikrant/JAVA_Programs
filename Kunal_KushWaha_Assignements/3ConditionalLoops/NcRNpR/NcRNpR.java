
import java.util.Scanner;

public class NcRNpR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("Enter the value of r");
        int r = in.nextInt();
        int nCr = fact(n)/(fact(r)* fact(n-r));
        System.out.println("The value of nCr is "+ nCr);
        int nPr = fact(n)/fact(r);
        System.out.println("The value of nPr is "+ nPr);
    }
    public static int fact(int n){
        if(n == 1){
            return 1;
        }else if(n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
}
