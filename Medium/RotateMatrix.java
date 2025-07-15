package Arrays.Medium;

import java.util.Arrays;

public class RotateMatrix {
    public void rotate(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < matrix.length; i++){
            int left = 0, right = matrix[0].length - 1;
            while(left < right){
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String args[]){
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        RotateMatrix sol = new RotateMatrix();
        sol.rotate(matrix);
    }
}
