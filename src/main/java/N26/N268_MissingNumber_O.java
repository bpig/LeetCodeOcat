package N26;

/**
 * Created by wenwen.xww on 2015/11/2.
 */
public class N268_MissingNumber_O {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length + 1; i++) {
            sum += i;
        }
        int realsum = 0;
        for (int i = 0; i < nums.length; i++) {
            realsum += nums[i];
        }
        return sum - realsum;
    }
}
