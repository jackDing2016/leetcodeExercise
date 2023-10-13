package question.doing;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href=https://leetcode.com/problems/rotate-image/>Go to Guest</a>
 */
public class NO48 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
//            for (int j = i; j < n - i - 1; j++) {
            for (int j = 0; j < n / 2; j++) {
                int xIndex = i, yIndex = j;
                int xOrigin = xIndex;
                for (int z = 0; z < 4; z++) {
                    matrix[n - 1 - yIndex][xIndex] = matrix[xIndex][yIndex];
                    xOrigin = xIndex;
                    xIndex = n - 1 - yIndex;
                    yIndex = xOrigin;
//                    int tmp = matrix[i][j];
//                    matrix[i][j] = matrix[n - j - 1][i];
//                    matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
//                    matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
//                    matrix[j][n - i - 1] = tmp;
//                }
                }
            }
        }
    }
}
