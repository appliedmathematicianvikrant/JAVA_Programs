
import java.util.Scanner;

public class Max_Element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the array element");
            arr[i] = in.nextInt();
        }
        // printing array elements
        System.out.println("You have enetered the following elements");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
       
        int max = max_search(arr);
        System.out.println("The max element is " + max);

    }

    static int max_search(int[] param_arr) {
        int max = param_arr[0];
        for (int i = 1; i < param_arr.length; i++) {
            if (param_arr[i] > param_arr[i-1]) {
                max = param_arr[i];
            } 
        
        }
        return max;
    }

}
