package N12;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */
public class N126_WordLadderII_BTest {
    N126_WordLadderII_B nb = new N126_WordLadderII_B();

    @Test
    public void testFindLadders() throws Exception {
        Set<String> wordlist = new HashSet<>(Arrays.asList(
                "hot", "dot", "dog", "lot", "log"));
        String beginWord = "hit";
        String endWord = "cog";
        List<List<String>> expect = new ArrayList<>();
        expect.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        expect.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));
        List<List<String>> ans = nb.findLadders(beginWord, endWord, wordlist);
        assertEquals(expect, ans);
    }
}