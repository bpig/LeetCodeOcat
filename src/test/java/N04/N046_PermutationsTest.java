package N04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-01
 */
public class N046_PermutationsTest {
    N046_Permutations nb = new N046_Permutations();

    @Test
    public void testPermute() throws Exception {
        List<List<Integer>> except = new ArrayList<>();
        except.add(Arrays.asList(3, 2, 1));
        except.add(Arrays.asList(2, 3, 1));
        except.add(Arrays.asList(2, 1, 3));
        except.add(Arrays.asList(3, 1, 2));
        except.add(Arrays.asList(1, 3, 2));
        except.add(Arrays.asList(1, 2, 3));

        int[] num = new int[]{1, 2, 3};
        List<List<Integer>> ret = nb.permute(num);
        assertEquals(except, ret);
    }
}