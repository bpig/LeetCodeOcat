package N03;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-24
 * <p/>
 * Implement next permutation,
 * which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p/>
 * If such arrangement is not possible,
 * it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * <p/>
 * The replacement must be in-place, do not allocate extra memory.
 * <p/>
 * Here are some examples.
 * Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * 1,2,3 -> 1,3,2
 * 3,2,1 -> 1,2,3
 * 1,1,5 -> 1,5,1
 * <p/>
 * 在当前序列中，从尾端往前寻找两个相邻元素，前一个记为first，后一个记为second，
 * 并且满足first 小于 second。然后再从尾端寻找另一个元素number，如果满足first 小于number，
 * 即将第first个元素与number元素对调，并将second元素之后（包括second）的所有元素颠倒排序，即求出下一个序列
 * <p/>
 * example: 6，3，4，9，8，7，1
 * 此时 first ＝ 4，second = 9 从尾巴到前找到第一个大于first的数字，就是7 交换4和7，
 * 即上面的swap函数，此时序列变成6，3，7，9，8，4，1 再将second＝9以及以后的序列重新排序，
 * 让其从小到大排序，使得整体最小，即reverse一下（因为此时肯定是递减序列）
 * 得到最终的结果：6，3，7，1，4，8，9
 * <p/>
 * void nextPermutation(vector<int>& nums) {
 * next_permutation(begin(nums), end(nums));
 * }
 * <p/>
 * void nextPermutation (vector<int>& nums) {
 * auto i = is_sorted_until(nums.rbegin(), nums.rend());
 * if( i != nums.rend()) { swap(*i,*upper_bound(nums.rbegin(), i, *i)) };
 * reverse(nums.rbegin(), i);
 * }
 */
public class N031_NextPermutation_B {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 1;
        int k = i;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            --i;
        }
        for (int j = i; j < k; j++, k--) {
            int tmp = nums[k];
            nums[k] = nums[j];
            nums[j] = tmp;
        }
        if (i > 0) {
            k = i--;
            while (nums[k] <= nums[i]) {
                k++;
            }
            int tmp = nums[k];
            nums[k] = nums[i];
            nums[i] = tmp;
        }
    }
}
