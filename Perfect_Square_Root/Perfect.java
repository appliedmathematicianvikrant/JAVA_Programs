import java.util.Scanner;

public class Perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to find the square root of");
        int num = in.nextInt();
        int res = sqrt(num);
        if(res == -1){
            System.out.println("This number is not a perfect square root.");
        }else{
            System.out.println("The square root of "+ num + " is "+ res);
        }

    }
    public static int sqrt(int n){
        for(int i = 1; i * i <= n; i++){
            if(i * i == n){
                return i;
            }
        }
        return -1;
    }
}
