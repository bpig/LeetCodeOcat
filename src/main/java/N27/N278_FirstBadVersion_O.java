package N27;

/**
 * Created by wenwen.xww on 2015/10/29.
 */
/*
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */

public class N278_FirstBadVersion_O {
    private int[] versions;
    private int firstBad = 4;
    public N278_FirstBadVersion_O(int n) {
        versions = new int[n+1];

        for (int i = 1; i < firstBad; i++) {
            versions[i] = 0;
        }
        for (int i = firstBad; i < n+1; i++) {
            versions[i] = 1;
        }
    }

    boolean isBadVersion(int version) {
        if (versions[version] == 1) {
            return true;
        }
        return false;
    }

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid;
        while (start != end) {
            mid =  start + (end - start) / 2;;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
