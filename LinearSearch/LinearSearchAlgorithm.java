import java.util.Scanner;
public class LinearSearchAlgorithm{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {-5, -4, 9, 0,11};
        int index = linearSearch(arr,0);
        if(index == -1){
            System.out.println("The element is not present in the array");
        }else{
            System.out.println("The element is found at index "+ index);
        }

        int max = maxSearch(arr);
        System.out.println("The maximum element in the array is "+ max);
        int min = minSearch(arr);
        System.out.println("The minimum element in the array is "+ min);
    }

    public static int maxSearch(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int minSearch(int[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int linearSearch(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }  
        }
         return -1;
    }
}