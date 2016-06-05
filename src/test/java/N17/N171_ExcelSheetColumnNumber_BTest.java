package N17;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016/5/15
 */
public class N171_ExcelSheetColumnNumber_BTest {
    N171_ExcelSheetColumnNumber_B nb = new N171_ExcelSheetColumnNumber_B();

    @Test
    public void titleToNumber() throws Exception {
        assertEquals(27, nb.titleToNumber("AA"));
    }

}