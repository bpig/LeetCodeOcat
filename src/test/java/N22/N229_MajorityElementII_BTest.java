package N22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-17
 */
public class N229_MajorityElementII_BTest {
    N229_MajorityElementII_B nb = new N229_MajorityElementII_B();

    @Test
    public void testMajorityElement() throws Exception {
        int[] nums;
        List<Integer> expect;

        nums = new int[]{0, 0, 0};
        expect = Arrays.asList(0);
        assertEquals(expect, nb.majorityElement(nums));

        nums = new int[]{0, 2, 1, 0, 1};
        expect = Arrays.asList(0, 1);
        assertEquals(expect, nb.majorityElement(nums));

        nums = new int[]{1,2,3};
        expect = new ArrayList<>();
        assertEquals(expect, nb.majorityElement(nums));
    }
}