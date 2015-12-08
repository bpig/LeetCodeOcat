package N27;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-07
 */

/**
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version,
 * all the versions after a bad version are also bad.
 * <p/>
 * Suppose you have n versions [1, 2, ..., n]
 * and you want to find out the first bad one,
 * which causes all the following ones to be bad.
 * <p/>
 * You are given an API bool isBadVersion(version)
 * which will return whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 */
public class N278_FirstBadVersion_B {
    boolean[] data;

    void setData(boolean[] d) {
        data = d;
    }

    boolean isBadVersion(int version) {
        return data[version - 1];
    }

    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}
