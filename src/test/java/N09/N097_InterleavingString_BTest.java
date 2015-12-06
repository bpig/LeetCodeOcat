package N09;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-06
 */
public class N097_InterleavingString_BTest {
    N097_InterleavingString_B nb = new N097_InterleavingString_B();

    @Test
    public void testIsInterleave() throws Exception {
        assertTrue(nb.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertFalse(nb.isInterleave("aabcc", "dbbca", "aadbbbaccc"));

        String s1;
        String s2;
        String s3;
        s1 = "bbbbbabbbbabaababaaaabbababbaaabbabbaaabaaaaababbbababbbbbabbbbababbabaabababbbaabababababbbaaababaa";
        s2 = "babaaaabbababbbabbbbaabaabbaabbbbaabaaabaababaaaabaaabbaaabaaaabaabaabbbbbbbbbbbabaaabbababbabbabaab";
        s3 = "babbbabbbaaabbababbbbababaabbabaabaaabbbbabbbaaabbbaaaaabbbbaabbaaabababbaaaaaabababbababaababbababbbababbbbaaaabaabbabbaaaaabbabbaaaabbbaabaaabaababaababbaaabbbbbabbbbaabbabaabbbbabaaabbababbabbabbab";
        assertFalse(nb.isInterleave(s1, s2, s3));
    }
}