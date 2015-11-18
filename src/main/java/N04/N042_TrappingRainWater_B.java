package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-17
 */


/**
 * Given n non-negative integers representing an elevation map
 * where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * <p/>
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class N042_TrappingRainWater_B {
    public int trap(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        int level = 0;
        while (left < right) {
            int lower = height[left] < height[right] ? height[left++] : height[right--];
            level = Math.max(lower, level);
            water += level - lower;
        }
        return water;
    }

    public int scoreB(int[] height) {
        if (height.length <= 2) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int maxIdx = -1;
        for (int i = 0; i < height.length; ++i) {
            if (height[i] > max) {
                max = height[i];
                maxIdx = i;
            }
        }
        int water = 0;
        int leftMax = height[0];
        for (int i = 1; i < maxIdx; ++i) {
            if (height[i] > leftMax) {
                leftMax = height[i];
            } else {
                water += leftMax - height[i];
            }
        }
        int rightMax = height[height.length - 1];
        for (int i = height.length - 2; i > maxIdx; --i) {
            if (height[i] > rightMax) {
                rightMax = height[i];
            } else {
                water += rightMax - height[i];
            }
        }
        return water;
    }
}
