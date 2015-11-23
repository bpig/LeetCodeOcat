package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-22
 * <p/>
 * You are given an n x n 2D matrix representing an image.
 * <p/>
 * Rotate the image by 90 degrees (clockwise).
 * <p/>
 * Follow up:
 * Could you do this in-place?
 * <p/>
 * 0,0  0,1  0,2  0,3  0,4
 * 1,0  1,1  1,2  1,3  1,4
 * 2,0  2,1  2,2  2,3  2,4         n = 3
 * 3,0  3,1  3,2  3,3  3,4         n = 4
 * 4,0  4,1  4,2  4,3  4,4         n = 5
 */
public class N048_RotateImage_B {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; ++i) {
            for (int j = i; j < n - i - 1; ++j) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[n - 1 - j][i];
                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
                matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
                matrix[j][n - 1 - i] = tmp;
            }
        }
    }
}
