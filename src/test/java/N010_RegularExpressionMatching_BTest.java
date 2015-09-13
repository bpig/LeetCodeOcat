import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-09-11
 */
public class N010_RegularExpressionMatching_BTest {
    N010_RegularExpressionMatching_B nb = new N010_RegularExpressionMatching_B();

    @Test
    public void testIsMatch() throws Exception {
        assertFalse(nb.isMatch("aa", "a"));
        assertTrue(nb.isMatch("aa", "aa"));
        assertFalse(nb.isMatch("aaa", "aa"));
        assertTrue(nb.isMatch("aa", "a*"));
        assertTrue(nb.isMatch("aa", ".*"));
        assertTrue(nb.isMatch("ab", ".*"));
        assertTrue(nb.isMatch("aab", "c*a*b"));
        assertFalse(nb.isMatch("ab", ".*c"));
        assertTrue(nb.isMatch("aaa", "a*a"));
        assertTrue(nb.isMatch("aaa", "a.*a"));

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        System.out.println(df.format(date));
        cal.add(Calendar.DATE, -1);
        date = cal.getTime();
        System.out.println(df.format(date));
    }

}