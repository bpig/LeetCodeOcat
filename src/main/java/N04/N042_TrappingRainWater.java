package N04;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-02-29
 */

/**
 * Given n non-negative integers representing an elevation map
 * where the width of each bar is 1,
 * compute how much water it is able to trap after raining.
 * <p>
 * For example,
 * Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 */
public class N042_TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;
        int level = 0;
        while (left < right) {
            int lower = height[left] < height[right] ? height[left++] : height[right--];
            level = Math.max(lower, level);
            water += level - lower;
        }
        return water;
    }
}
