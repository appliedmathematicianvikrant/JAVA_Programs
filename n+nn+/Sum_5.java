import java.util.Scanner;

public class Sum_5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the natural number");
        String num = in.next();
        int sum = 0;
        String incr = "";
        incr = incr + num;
        for(int i = 1; i <= 3; i++){
            sum = sum + Integer.parseInt(incr);
            incr = incr + "5";
        }
        System.out.println(sum);
    }
}