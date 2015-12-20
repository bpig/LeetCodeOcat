package N29;

import org.junit.Test;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-20
 */
public class N295_FindMedianFromDataStream_BTest {
    N295_FindMedianFromDataStream_B nb = new N295_FindMedianFromDataStream_B();

    @Test
    public void testFindMedian() throws Exception {
        nb.addNum(3);
        nb.addNum(7);
        nb.addNum(2);
        nb.addNum(4);
        nb.addNum(6);
        nb.findMedian();
    }
}