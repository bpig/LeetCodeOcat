package N16;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-11-08
 */
public class N168_ExcelSheetColumnTitle_BTest {
    N168_ExcelSheetColumnTitle_B nb = new N168_ExcelSheetColumnTitle_B();
    @Test
    public void testConvertToTitle() throws Exception {
        assertEquals("BA", nb.convertToTitle(53));
        assertEquals("Z", nb.convertToTitle(26));
        assertEquals("A", nb.convertToTitle(1));
    }
}