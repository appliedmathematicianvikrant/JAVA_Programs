import java.util.Arrays;
import java.util.Scanner;

public class MergeSortProgram{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();

        int arr[] = new int[size];
        //asking for the user input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the"+ (i+1)+" st element");
            arr[i] = in.nextInt();
        }

        //printing the entered array
        System.out.println(Arrays.toString(arr));

        //receiving the sorted array
        int [] res = DivideMethod(arr);

        //printing the sorted array
        System.out.println(Arrays.toString(res));
        
    }

    public static int[] DivideMethod(int[] arr){
        if (arr.length == 1) {
            return arr;
        }

            int mid = arr.length / 2;
            int [] left = DivideMethod(Arrays.copyOfRange(arr, 0, mid));
            int [] right = DivideMethod(Arrays.copyOfRange(arr, mid, arr.length));

            return MergeMethod(left, right);
    
    }

    private static int[] MergeMethod(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mergedArray[k] = left[i];
                i++;
            }else if (right[j] < left[i]) {
                mergedArray[k] = right[j];
                j++;
            }
            k++;
        }

        //If one of them exhaust and the other one does not then the following will also run
        while (i < left.length) {
            mergedArray[k] = left[i];
            i++;
            k++;
        }

         while (j < right.length) {
            mergedArray[k] = right[j];
            j++;
            k++;
        }
        return mergedArray;
    }
}