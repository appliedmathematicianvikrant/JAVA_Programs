public class Ceiling
{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,6};
        int target = 4;
        int resultIndex = CeilingBinary(arr, target);
        System.out.println(arr[resultIndex]);
    }

    public static int CeilingBinary(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return arr[mid];
            }else if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid+1;
            }
           
        }
         return start;
    }
}