import java.util.Scanner;

public class Linear_search_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows.");
        int row = in.nextInt();
        System.out.println("Enter the number of columns.");
        int col = in.nextInt();
        int[][] matrix = new int[row][col];
        //Enter the matrix elements
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

        System.out.println("Enter the element you want to search for");
        int target = in.nextInt();

        //
        int[] result_index = matrix_search(matrix, target);
        System.out.println("The element is passed at row " + result_index[0] + " and column " + result_index[1]);

    }
    // function which search for the element in teh matrix via linear search
    static int[] matrix_search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[] { i + 1, j + 1 };
                }
            }

        }
        return new int[] { -1, -1 };

    }
}
