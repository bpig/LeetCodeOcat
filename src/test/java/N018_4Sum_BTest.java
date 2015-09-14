import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-14
 */
public class N018_4Sum_BTest {
    N018_4Sum_B nb = new N018_4Sum_B();

    @Test
    public void testFourSum() throws Exception {
        List<List<Integer>> result = nb.fourSum(new int[]{1, 0, -1, 0, 2, -2}, 0);
        List<List<Integer>> expect = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(-2, -1, 1, 2));
            add(Arrays.asList(-2, 0, 0, 2));
            add(Arrays.asList(-1, 0, 0, 1));

        }};

        assertEquals(expect, result);
    }

    @Test
    public void testFourSum0() throws Exception {

        List<List<Integer>> result = nb.fourSum(new int[]{-5, 5, 4, -3, 0, 0, 4, -2}, 4);
        List<List<Integer>> expect = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(-5, 0, 4, 5));
            add(Arrays.asList(-3, -2, 4, 5));
        }};

        assertEquals(expect, result);
    }

}