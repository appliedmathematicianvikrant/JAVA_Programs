
import java.util.Scanner;

public class LinearSearchMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = {
            {1,2,3},{-9,0,-5},{11,23,-8}
        };

     int[] index = linearSearchMatrix(matrix, 11);
     System.out.println("The element is found in row "+ (index[0]+ 1)+ " and column "+(index[1] + 1));
    }
    public static int[] linearSearchMatrix(int[][] matrix, int target){
        int[] result = new int[2];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] == target){
                    result[0] = row;
                    result[1] = col;
                }
            }  
        }
         return result;
    }
}
