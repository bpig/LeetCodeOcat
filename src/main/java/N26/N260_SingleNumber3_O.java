package N26;

/**
 * Created by wenwen.xww on 2015/11/2.
 */
public class N260_SingleNumber3_O {
    public int[] singleNumber(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        int lastOne = res - (res & (res - 1));
        int[] re = {0, 0};
        for (int i = 0; i < nums.length; i++) {
            if ((lastOne & nums[i]) == 0) {
                re[0] ^= nums[i];
            } else {
                re[1] ^= nums[i];
            }
        }
        return re;
    }
}
