package Arrays.Medium;

import java.util.*;

public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length -1;
        List<Integer> result = new ArrayList<>();
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int j = top; j <= bottom; j++){
                result.add(matrix[j][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String args[]){
        int[][] matrix = {{1, 2, 3}, {4 ,5 ,6}, {7, 8, 9}};
        SpiralMatrix sol = new SpiralMatrix();
        System.out.println(sol.spiralOrder(matrix));
    }
}