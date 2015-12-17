package N13;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome.
 * <p/>
 * Return the minimum cuts needed for a palindrome partitioning of s.
 * <p/>
 * For example, given s = "aab",
 * Return 1 since the palindrome partitioning ["aa","b"] could be produced using 1 cut.
 * <p/>
 * https://leetcode.com/discuss/47140/two-versions-given-one-28ms-one-manancher-like-algorithm-10
 */
public class N132_PalindromePartitioningII_B {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        for (; i < j; ++i, --j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public int minCut(String s) {
        int n = s.length();
        if (n <= 1) {
            return 0;
        }
        boolean[][] pal = new boolean[n][n];
        int[] d = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            d[i] = n - i - 1;
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || pal[i + 1][j - 1])) {
                    pal[i][j] = true;
                    if (j == n - 1) {
                        d[i] = 0;
                    } else if (d[j + 1] + 1 < d[i]) {
                        d[i] = d[j + 1] + 1;
                    }
                }
            }
        }
        return d[0];
    }

    public int minCutScoreAPlus(String s) {
        int n = s.length();
        int[] cut = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            cut[i] = i - 1;
        }

        for (int i = 0; i < n; i++) {
            // odd length palindrome
            for (int j = 0; i - j >= 0 && i + j < n
                    && s.charAt(i - j) == s.charAt(i + j); j++) {
                cut[i + j + 1] = Math.min(cut[i + j + 1], 1 + cut[i - j]);
            }
            // even length palindrome
            for (int j = 1; i - j + 1 >= 0 && i + j < n
                    && s.charAt(i - j + 1) == s.charAt(i + j); j++) {
                cut[i + j + 1] = Math.min(cut[i + j + 1], 1 + cut[i - j + 1]);
            }
        }
        return cut[n];
    }

    // tle
    public int scoreB(String s) {
        int n = s.length();
        if (n <= 1) {
            return 1;
        }
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            ans[i] = n - i;
        }
        for (int i = n - 2; i >= 0; --i) {
            for (int j = n; j >= i + 1; --j) {
                if (ans[i] > 1 + ans[j] && isPalindrome(s.substring(i, j))) {
                    ans[i] = 1 + ans[j];
                }
            }
        }
        return ans[0];
    }
}
