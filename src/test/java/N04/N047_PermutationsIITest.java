package N04;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-03-02
 */
public class N047_PermutationsIITest {
    N047_PermutationsII nb = new N047_PermutationsII();

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

        except = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(1, 2, 3));
            add(Arrays.asList(1, 3, 2));
            add(Arrays.asList(2, 1, 3));
            add(Arrays.asList(2, 3, 1));
            add(Arrays.asList(3, 1, 2));
            add(Arrays.asList(3, 2, 1));
        }};
        num = new int[]{1, 2, 3};
        assertEquals(except, nb.permuteUnique(num));
    }
}