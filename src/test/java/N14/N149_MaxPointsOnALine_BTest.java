package N14;

import org.junit.Test;
import util.Point;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */
public class N149_MaxPointsOnALine_BTest {
    N149_MaxPointsOnALine_B nb = new N149_MaxPointsOnALine_B();

    @Test
    public void testMaxPoints() throws Exception {
        Point[] pts;
        pts = new Point[]{new Point(1, 1), new Point(1, 1), new Point(1, 1)};
        assertEquals(3, nb.maxPoints(pts));

        pts = new Point[]{new Point(0, 0), new Point(1, 1), new Point(0, 0)};
        assertEquals(3, nb.maxPoints(pts));
    }
}