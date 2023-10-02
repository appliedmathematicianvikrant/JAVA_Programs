
import java.util.Scanner;

public class Sorting_two_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the first array");
        int size1 = in.nextInt();
        int[] arr = new int[size1];
        // Creating the first array
        System.out.println("Enter the array elements in sorted order.");
        for(int i = 0; i < size1; i++){
            arr[i] = in.nextInt();
        }
        // printing the first array
        System.out.println("You have entered the following array");
        for(int i = 0; i < size1; i++){
            System.out.println(arr[i]+ " ");
        }

        System.out.println("Enter the size of the second array");
        int loc_size = in.nextInt();
        int size2 = loc_size+size1;
        int[] bigarr = new int[size2];
        System.out.println("Enter the array elements of the second array in sorted order");
        for(int i = 0; i < loc_size; i++){
            bigarr[i] = in.nextInt();
        }

        //printing the big array elemnts
        System.out.println("You have entered the following elements into ytou big array");
        for(int i = 0; i < loc_size; i++){
            System.out.println(bigarr[i] + " ");
        }

        
        if(arr[0] > bigarr[loc_size-1] ){
            // 
        int j = 0;   // variable for loop
        for(int i = loc_size; i< size2; i++){
            bigarr[i] = arr[j];
            j++;
        }
        }else if(){
            
        }
        

        // display the big array
        System.out.println("The big array has become");
        for(int i = 0; i < size2; i++){
            System.out.print(bigarr[i] + " ");
        }


    }
}
