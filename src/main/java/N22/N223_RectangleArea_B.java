package N22;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */

import java.util.Arrays;

/**
 * Find the total area covered by two rectilinear rectangles in a 2D plane.
 * <p/>
 * Each rectangle is defined by its bottom left corner and top right corner as shown in the figure.
 * <p/>
 * Rectangle Area
 * Assume that the total area is never beyond the maximum possible value of int.
 */
public class N223_RectangleArea_B {
    public int scoreB(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (G - E) * (H - F);
        if (A >= G || E >= C || B >= H || F >= D) {
            return area;
        }
        int[] height = new int[]{A, C, E, G};
        int[] width = new int[]{B, D, F, H};
        Arrays.sort(height);
        Arrays.sort(width);
        return area - (height[2] - height[1]) * (width[2] - width[1]);
    }

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (G - E) * (H - F);
        int common = (C <= E || A >= G || B >= H || D <= F) ? 0 : (Math.min(C, G) - Math.max(A, E)) * (Math.min(D, H) - Math.max(B, F));
        return area - common;
    }

    public int computeAreaC(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area = (C - A) * (D - B) + (G - E) * (H - F);
        int left = Math.max(A, E);
        int right = Math.max(Math.min(C, G), left);
        int bottom = Math.max(B, F);
        int top = Math.max(Math.min(D, H), bottom);
        return area - (right - left) * (top - bottom);
    }
}
