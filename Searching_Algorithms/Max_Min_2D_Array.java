
import java.util.Scanner;

public class Max_Min_2D_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = in.nextInt();
        System.out.println("Enter the number of columns.");
        int col = in.nextInt();
        int[][] matrix = new int[row][col];
        // Enter the matrix elements
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Enter the elements for the " + (i + 1) + " row");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        // printing the matrix elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        int min = matrix_min_search(matrix);
        System.out.println("The minimum element in the matrix is "+ min);
        int max = matrix_max_search(matrix);
         System.out.println("The maximum element in the matrix is "+ max);


    }

    // function which search for the minimum element in the matrix via linear search
    static int matrix_min_search(int[][] matrix) {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }

        }
        return min;
    }

    // function which search for the element in teh matrix via linear search
    static int matrix_max_search(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }

        }
        return max;
    }

}
