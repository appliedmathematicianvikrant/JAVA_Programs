
import java.util.Scanner;

public class Min_Element {
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
       
        int min = min_search(arr);
        System.out.println("The minimum element is " + min);

    }

    static int min_search(int[] param_arr) {
        int min = param_arr[0];
        for (int i = 1; i < param_arr.length; i++) {
            if (param_arr[i] < param_arr[i-1]) {
                min= param_arr[i];
            } 
        
        }
        return min;
    }

}
