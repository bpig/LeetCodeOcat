package N01;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-14
 */
public class N018_4SumTest {
    N018_4Sum nb = new N018_4Sum();

    @Test
    public void testFourSum() throws Exception {
        List<List<Integer>> ans;
        List<List<Integer>> expect;

        expect = new ArrayList<>();
        expect.add(Arrays.asList(-2, -1, 1, 2));
        expect.add(Arrays.asList(-2, 0, 0, 2));
        expect.add(Arrays.asList(-1, 0, 0, 1));
        ans = nb.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        assertEquals(expect, ans);

        expect = new ArrayList<>();
        expect.add(Arrays.asList(-1, 0, 1, 2));
        ans = nb.fourSum(new int[]{2, 1, 0, -1}, 2);
        assertEquals(expect, ans);
    }
}