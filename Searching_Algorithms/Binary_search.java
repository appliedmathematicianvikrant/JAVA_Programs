import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arrAsc = { 1, 2, 3, 4, 5, 6, 7 };
        int[] arrDesc = {8,7,6,5,4,3};
        int resAsc = searchAsc(arrAsc, 9);   // call the searching for the ascedning array
        int resDesc = searchDesc(arrDesc, 7);
        System.out.println("The element is found at index "+ resAsc+ " for the increasing array");
        System.out.println("The element is found at index "+ resDesc+ " for the descending array ");

    }

    static int searchAsc(int[] arr, int target) {
        int strt = 0;
        int end = arr.length - 1;
        while (strt <= end) {
            int mid = strt + (end - strt) / 2;
            if (arr[mid] < target) {
                strt = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


     static int searchDesc(int[] arr, int target) {
        int strt = 0;
        int end = arr.length - 1;
        while (strt <= end) {
            int mid = strt + (end - strt) / 2;
            if (arr[mid] > target) {
                strt = mid + 1;
            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
