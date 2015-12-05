package N08;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-04
 */

import java.util.Arrays;

/**
 * Given a 2D binary matrix filled with 0's and 1's,
 * find the largest rectangle containing all ones and return its area.
 */
public class N085_MaximalRectangle_B {
    public int scoreA(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int ans = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int[] height = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '0') {
                    height[j] = 0;
                    continue;
                }
                height[j]++;
                for (int cur = j - 1, pre = height[j]; cur >= 0; cur--) {
                    if (height[cur] == 0) {
                        break;
                    }
                    pre = Math.min(pre, height[cur]);
                    ans = Math.max(ans, (j - cur + 1) * pre);
                }
                ans = Math.max(ans, height[j]);
            }
        }
        return ans;
    }

    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int ans = 0;
        int[] height = new int[matrix[0].length];
        for (int i = 0; i < matrix.length; ++i) {
            char[] row = matrix[i];
            for (int j = 0; j < row.length; ++j) {
                if (row[j] == '1') {
                    height[j]++;
                } else {
                    height[j] = 0;
                }
            }
            ans = Math.max(calHistogram(height), ans);
        }
        return ans;
    }

    public int calHistogram(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        for (int i = 1; i < n; ++i) {
            int p = i - 1;
            while (p >= 0 && height[p] >= height[i]) {
                p = left[p] - 1;
            }
            left[i] = p + 1;
        }

        for (int i = n - 2; i >= 0; --i) {
            int p = i + 1;
            while (p < n && height[p] >= height[i]) {
                p = right[p];
            }
            right[i] = p;
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            ans = Math.max(ans, height[i] * (right[i] - left[i]));
        }
        return ans;
    }
}
