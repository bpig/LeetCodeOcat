package N14;

/**
 * Created: shuai.li(286287737@qq.com)
 * Date: 2015-12-09
 */

import util.Point;

/**
 * Given n points on a 2D plane,
 * find the maximum number of points that lie on the same straight line.
 */
public class N149_MaxPointsOnALine_B {
    public int maxPoints(Point[] points) {
        if (points == null) {
            return 0;
        }
        if (points.length <= 2) {
            return points.length;
        }

        int ans = 0;
        int n = points.length;

        for (int i = 0; i < n; i++) {
            Point p = points[i];
            int duplicates = 0;
            for (int j = i + 1; j < n; j++) {
                Point q = points[j];
                if (q.x == p.x && q.y == p.y) {
                    duplicates++;
                    ans = Math.max(ans, duplicates + 1);
                    continue;
                }

                int count = 1;
                for (int k = j + 1; k < n; k++) {
                    Point r = points[k];
                    count += isCoLinear(p, q, r) ? 1 : 0;
                }
                ans = Math.max(ans, count + duplicates + 1);
            }
        }
        return ans;
    }

    boolean isCoLinear(Point p, Point q, Point r) {
        int val = (q.y - p.y) * (r.x - q.x) - (r.y - q.y) * (q.x - p.x);
        return val == 0;
    }
}
