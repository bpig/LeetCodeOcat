package N21;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-08
 */
public class N218_TheSkylineProblem_BTest {
    N218_TheSkylineProblem_B nb = new N218_TheSkylineProblem_B();

    @Test
    public void testGetSkyline() throws Exception {
        // [ [2 9 10], [3 7 15], [5 12 12], [15 20 10], [19 24 8] ] .
        int[][] building = new int[][]{
                {2, 9, 10},
                {3, 7, 15,},
                {5, 12, 12,},
                {15, 20, 10},
                {19, 24, 8}
        };
        List<int[]> expect = new ArrayList<>();
        
        //[ [2 10], [3 15], [7 12], [12 0], [15 10], [20 8], [24, 0] ].
    }
}