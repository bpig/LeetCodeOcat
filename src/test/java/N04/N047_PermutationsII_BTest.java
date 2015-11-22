package N04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-22
 */
public class N047_PermutationsII_BTest {
    N047_PermutationsII_B nb = new N047_PermutationsII_B();

    @Test
    public void testPermuteUnique() throws Exception {
        List<List<Integer>> except;
        int[] num;

        except = new ArrayList<>();
        except.add(Arrays.asList(1, 1, 2));
        except.add(Arrays.asList(1, 2, 1));
        except.add(Arrays.asList(2, 1, 1));

        num = new int[]{1, 1, 2};
        assertEquals(except, nb.permuteUnique(num));

        except = new ArrayList<>();
        except.add(Arrays.asList(0, 0, 0, 1));
        except.add(Arrays.asList(0, 0, 1, 0));
        except.add(Arrays.asList(0, 1, 0, 0));
        except.add(Arrays.asList(1, 0, 0, 0));

        num = new int[]{0, 1, 0, 0};
        assertEquals(except, nb.permuteUnique(num));
    }
}