import java.util.Scanner;

public class Linear_Search {
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
        System.out.println("Enter the element you want to search for");
        int target = in.nextInt();
        // passing the array to searching algorithm
        // recives the index at which the element is found, -1 if not found
        int index = linear_search(arr, target);
        System.out.println("The element is found at index " + index);

    }

    static int linear_search(int[] param_arr, int target) {
        for (int i = 0; i < param_arr.length; i++) {
            if (param_arr[i] == target) {
                return i;
            } 
        
        }
        return -1;
    }

}
