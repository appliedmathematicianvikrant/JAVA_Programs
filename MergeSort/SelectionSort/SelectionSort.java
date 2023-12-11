package MergeSort.SelectionSort;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {4,5,1,2,3};
        
        MergeSort(arr);

    
    
}

    private static void MergeSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = MaxIndexCalc(arr,0,last);
        }
    }

    private static int MaxIndexCalc(int[] arr, int i, int last) {
        int max = 0;
        for (int j = start; j < arr.length; j++) {
            
        }
        return 0;
    }
}
