package Arrays.Medium;

import java.util.Arrays;

public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        boolean zeroRows[] = new boolean[matrix.length];
        boolean zeroCol[] = new boolean[matrix[0].length];
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroRows[i] = true;
                    zeroCol[j] = true;
                }
            }
        }
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(zeroRows[i] == true || zeroCol[j] == true){
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String args[]){
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        SetMatrixZeroes sol = new SetMatrixZeroes();
        sol.setZeroes(matrix);
    }
}