import java.util.Scanner;

public class Set_Matrix_zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix.");
        int row = in.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        int colmn = in.nextInt();

        int[][] matrix = new int[row][colmn];

        for (int i = 0; i < row; i++) {
            System.out.println("Enter the elements for the " + (i + 1) + " row of matrix");
            for (int j = 0; j < colmn; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        System.out.println("You have entered the matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colmn; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colmn; j++) {
                if (matrix[i][j] == 0) {
                    for (int l = 0; l < row; l++) {
                        for (int m = 0; m < colmn; m++) {
                            matrix[l][m] = 0;
                        }
                    }
                     break; 
                }

            }

        }
        System.out.println("The matrix after operation is ");
        for(int x = 0;x<row;x++)
    {
        for (int y = 0; y < colmn; y++) {
            System.out.print(matrix[x][y]);
            System.out.print("  ");
        }
        System.out.println();
    }

}
}
