package N01;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2016-01-14
 */
public class N017_LetterCombinationsOfAPhoneNumberTest {
    N017_LetterCombinationsOfAPhoneNumber nb = new N017_LetterCombinationsOfAPhoneNumber();

    @Test
    public void testLetterCombinations() throws Exception {
        List<String> expect;
        List<String> ans;
        expect = Arrays.asList("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf");
        ans = nb.letterCombinations("23");
        assertEquals(expect, ans);
    }
}