package N16;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-05
 */

/**
 * Compare two version numbers version1 and version2.
 * If version1 > version2 return 1,
 * if version1 < version2 return -1, otherwise return 0.
 * <p/>
 * You may assume that the version strings are non-empty and contain only digits and the . character.
 * The . character does not represent a decimal point and is used to separate number sequences.
 * For instance, 2.5 is not "two and a half" or "half way to version three",
 * it is the fifth second-level revision of the second first-level revision.
 * <p/>
 * Here is an example of version numbers ordering:
 * <p/>
 * 0.1 < 1.1 < 1.2 < 13.37
 */
public class N165_CompareVersionNumbers_B {
    // fast
    public int compareVersion(String version1, String version2) {
        while (version1.length() > 0 || version2.length() > 0) {
            int int1 = version1.length() > 0 ?
                    Integer.parseInt(version1.substring(0, version1.indexOf('.') > 0 ? version1.indexOf('.') : version1.length())) : 0;
            int int2 = version2.length() > 0 ?
                    Integer.parseInt(version2.substring(0, version2.indexOf('.') > 0 ? version2.indexOf('.') : version2.length())) : 0;
            if (int1 > int2) {
                return 1;
            } else if (int2 > int1) {
                return -1;
            }
            version1 = version1.indexOf('.') > 0 ? version1.substring(version1.indexOf('.') + 1) : "";
            version2 = version2.indexOf('.') > 0 ? version2.substring(version2.indexOf('.') + 1) : "";
        }
        return 0;
    }

    public int scoreB(String version1, String version2) {
        String[] v1 = version1.split("\\."), v2 = version2.split("\\.");
        int i;
        for (i = 0; i < v1.length && i < v2.length; i++) {
            int i1 = Integer.parseInt(v1[i]);
            int i2 = Integer.parseInt(v2[i]);
            if (i1 != i2) {
                return i1 > i2 ? 1 : -1;
            }
        }
        for (; i < v1.length; i++) {
            if (Integer.parseInt(v1[i]) != 0) {
                return 1;
            }
        }
        for (; i < v2.length; i++) {
            if (Integer.parseInt(v2[i]) != 0) {
                return -1;
            }
        }
        return 0;
    }
}
